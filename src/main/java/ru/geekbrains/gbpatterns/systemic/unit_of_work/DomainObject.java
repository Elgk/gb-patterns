package ru.geekbrains.gbpatterns.systemic.unit_of_work;

public class DomainObject {

    protected void markNew(){
        UnitOfWork.getCurrent().registryNew(this);
    }

    protected void markDirty(){
        UnitOfWork.getCurrent().registryDirty(this);
    }

    protected void markClean(){
        UnitOfWork.getCurrent().registryClean(this);
    }

    protected void markRemove(){
        UnitOfWork.getCurrent().registryRemove(this);
    }

}
