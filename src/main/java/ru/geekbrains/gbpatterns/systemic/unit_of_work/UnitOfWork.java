package ru.geekbrains.gbpatterns.systemic.unit_of_work;

import ru.geekbrains.gbpatterns.systemic.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private static ThreadLocal current = new ThreadLocal();

    private List<DomainObject> newObjects = new ArrayList<>();
    private List<DomainObject> dirtyObjects = new ArrayList<>();
    private List<DomainObject> removeObjects = new ArrayList<>();

    public void registryNew(DomainObject object){

    }
    public void registryDirty(DomainObject object){

    }
    public void registryRemove(DomainObject object){

    }
    public void registryClean(DomainObject object){

    }

    public void commit(){
        insertNew();
        updateDirty();
        deleteRemoved();
    }

    private void deleteRemoved() {
    }

    private void updateDirty() {
    }

    private void insertNew() {
        for (DomainObject object : newObjects) {
         //   MapperRegistry.getMapper(object.getClass()).insert(object);

        }
    }

    public static void newCurrent() {
        setCurrent(new UnitOfWork());
    }
    public static void setCurrent(UnitOfWork unitOfWork) {
        current.set(unitOfWork);
    }

    public static UnitOfWork getCurrent() {
        return (UnitOfWork) current.get();
    }
}
