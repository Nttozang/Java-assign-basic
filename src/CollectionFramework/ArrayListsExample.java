package CollectionFramework;

import CollectionFramework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsExample {
    public static void main(String[] args) {
        var iphone= new Product("iphone",35000.0,20);
        var linuxLaptop = new Product("laptop linux",13000.0,20);
        var bookProduct = new Product("Book",230.0,10);

        List<Product> products = new ArrayList<>();

        products.add(iphone);
        products.add(linuxLaptop);
        products.add(bookProduct);

        for(var p : products){
            System.out.println(p);
        }
        System.out.println("-----------------------------------");
        // add all
        List<Product> products1 = new ArrayList<>();
        var car = new Product("benz",250000.0,2);
        products1.add(car);
        products1.addAll(products);
        for(var c : products1){
            System.out.println(c);
        }
        System.out.println("-----------------------------------");
        //get first
        System.out.println(products1.getFirst());
        System.out.println(products1.getLast());
        System.out.println(products1.get(2));
        System.out.println(products1.contains(bookProduct));
        System.out.println(products1.contains(linuxLaptop));
        System.out.println(products1.contains("iphone"));
        System.out.println("-----------------------------------");

        //Modify data within array list - Normal class , cannot use record
        //Replace data on the index
        var index2 = products1.get(2);
        System.out.println("Before: " + index2);

        var doll = new Product("Doll",150.0,5);
        var newIndex2 = products1.set(2,doll);
        System.out.println("Replaced: " + newIndex2);
        System.out.println("After: " + products1.get(2));
    }
}
