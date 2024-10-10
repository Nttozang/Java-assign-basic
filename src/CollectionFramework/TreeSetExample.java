package CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        number.add(50);
        number.add(150);
        number.add(100);
        number.add(250);
        number.add(30);
        System.out.println(number);
        number.remove(100);
        System.out.println(number);
    }
}
