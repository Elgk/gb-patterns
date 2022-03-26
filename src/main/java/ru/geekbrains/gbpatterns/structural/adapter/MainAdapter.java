package ru.geekbrains.gbpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainAdapter {
    public static void main(String[] args) {
        List<Roundable> roundableList = new ArrayList<>();
        roundableList.add(new Circle(2));
        roundableList.add(new Adapter(new Square(2)));
        roundableList.add(new Adapter(new Square(1)));
        roundableList.add(new Circle(1));
        roundableList.sort(Comparator.comparing(Roundable::getRadius));
        System.out.println(roundableList);

        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(3);
        Square square1 = new Square(6);
        Square square2 = new Square(2);
        List<Circle> circles = Arrays.asList(circle1, circle2);
        List<Square> squares = Arrays.asList(square1, square2);
        
        List<Object> all = new ArrayList<>();
        all.addAll(circles);
        all.addAll(squares);
        all.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return Double.compare(asRoundable(o1).getRadius(), asRoundable(o2).getRadius());
            }
        });
        System.out.println(all);
    }

    public static Roundable asRoundable(Object o){
        if (o instanceof Circle){
            return (Roundable) o;
        }else if (o instanceof Square){
            return new Adapter((Square) o);
        }
        throw new InternalError("Unexpected type");
    }
}
