package CollectionFramework.Other;

import CollectionFramework.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public static void main(String[] args) {
        var onepiece = new Product("onepiece",2000.00,20);
        var twopiece = new Product("twopiece",4000.00,40);
        var fourpiece = new Product("fourpiece",8000.00,80);
        var threepiece = new Product("threepiece",6000.00,60);


        List<Product> book = new ArrayList<>();
        book.add(onepiece);
        book.add(twopiece);
        book.add(threepiece);
        book.add(fourpiece);

        //ASC 0 TO 1
        Collections.sort(book);
        System.out.println(book);
        //DESC 1 TO 0
        Collections.sort(book.reversed());
        System.out.println(book.reversed());
    }
}
