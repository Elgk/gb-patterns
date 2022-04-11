package ru.geekbrains.gbpatterns.systemic.value_object;

import java.util.HashSet;
import java.util.Set;

public class ValueObject {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc").intern(); // ищет ссылку на "abc" и не создает новый объект, экономит память
        System.out.println(str1 == str3);

        /* String является Value object
         т.к. ссылки разные, а по значению эти объекты равны
         */
        Set<String> set = new HashSet<>();
        set.add(str1);
        set.add(str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(set.contains(str2));
        System.out.println(set);

        System.out.println(new Point(1,2).equals(new Point(1,2)));
        System.out.println(new Point(1,2).equals(new Point(1,3)));
    }
}
