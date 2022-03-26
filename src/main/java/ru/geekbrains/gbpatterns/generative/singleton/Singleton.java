package ru.geekbrains.gbpatterns.generative.singleton;

public class Singleton {
    public void work() {
        System.out.println("I'm working");
    }

    /* // при многопоточности такая реализация одиночки не срабатывает, может быть несколько экземпляров
       private static Singleton instance;

       public static Singleton getInstan(){


           if (instance == null){
               instance = new Singleton();
           }
           return instance;
        Singleton localInstance = instance;
    }*/

    // double checking реализация (медленный способ), пример ленивой инициализации
/*    private static volatile Singleton instance;

    public static Singleton getInstance(){
        Singleton localInstace = instance;
        if (localInstace == null){
            synchronized (Singleton.class){
                localInstace = instance;
                if (localInstace == null){
                    instance = localInstace = new Singleton();
                }
            }
        }
        return instance;
    }*/

// не ленивая инициализация, объект-одиночка создается сразу при загрузке класса
    //    public static final Singleton INSTANCE = new Singleton();

    // ленивая реализация (более эффекттивная)
    private static  class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        // ленивая реализация
        // объект-одиночка создается не сразу при загрузке классов, а при обращении getInstance()
        final Singleton instance = Singleton.getInstance();
    }
}

// реализация через перчисления, объект-одиночка создается сразу при загрузке класса
// public enum Singleton1{
//    INSTANCE();
// }
