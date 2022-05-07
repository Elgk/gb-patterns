package ru.geekbrains.networkhome.mapping_util;

import java.util.ArrayList;
import java.util.List;

public class AppUnitOfWork {
    private static ThreadLocal current = new ThreadLocal();

    private  ConnectionManager connectionManager;

    private List<DomainObj> newObjects = new ArrayList<>();
    private List<DomainObj> dirtyObjects = new ArrayList<>();
    private List<DomainObj> removeObjects = new ArrayList<>();

    public static AppUnitOfWork getCurrent(){
        return  (AppUnitOfWork) current.get();
    }

    public static void setCurrent(AppUnitOfWork unit){
        current.set(unit);
    }

    public static void newCurrent(){
        setCurrent(new AppUnitOfWork());
    }

    public void registryNew(DomainObj obj){
        if (obj.getId() != null){
            if (!dirtyObjects.contains(obj)){
                if (!removeObjects.contains(obj)){
                    if (!newObjects.contains(obj)){
                        newObjects.add(obj);
                    }
                }
            }
        }
    }

    public void registryDirty(DomainObj obj){
        if (obj.getId() != null) {
            if (!removeObjects.contains(obj)){
                if (!newObjects.contains(obj)){
                    if (!dirtyObjects.contains(obj)){
                        dirtyObjects.add(obj);
                    }
                }
            }
        }
    }

    public void registryRemoved(DomainObj obj){
        if (obj.getId() != null) {
            newObjects.remove(obj);
            dirtyObjects.remove(obj);
            if (!removeObjects.contains(obj)){
                removeObjects.add(obj);
            }
        }
    }

    public void registryClean(){
        newObjects.clear();
        dirtyObjects.clear();
        removeObjects.clear();
    }
    
    public void commit(){
        insertNew();
        updateDirty();
        deleteRemoved();
    }

    private void deleteRemoved() {
        for (DomainObj removeObject : removeObjects) {
            MapperRegistry.getInstance().getMapper(removeObject.getClass()).delete(removeObject);
        }
    }

    private void updateDirty() {
        for (DomainObj dirtyObject : dirtyObjects) {
            MapperRegistry.getInstance().getMapper(dirtyObject.getClass()).update(dirtyObject);
        }
    }

    private void insertNew() {
        for (DomainObj newObject : newObjects) {
         MapperRegistry.getInstance().getMapper(newObject.getClass()).insert(newObject);
        }
    }
}
