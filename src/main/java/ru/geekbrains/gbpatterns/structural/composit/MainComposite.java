package ru.geekbrains.gbpatterns.structural.composit;

public class MainComposite {
    // паттерн для иерархических объектов, классический пример дерево (лист и ветка)
    public static void main(String[] args) {
        //
        Item item1 = new Product(2);
        Item item2 = new Product(4);
        Item item3 = new Product(6);
        Item item4 = new Product(5);
        Item box1 = new Box();
        Item box2 = new Box();

        box1.add(item1);
        box1.add(item1);
        box1.add(item2);
        box1.add(item3);
        box1.add(item3);

        box2.add(box1, item4);

        System.out.println(box1.getPrice());
        box1.remove(item3);

        System.out.println(box1.getPrice());
        System.out.println(box2.getPrice());



    }
}
