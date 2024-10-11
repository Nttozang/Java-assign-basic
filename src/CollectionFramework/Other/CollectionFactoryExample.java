package CollectionFramework.Other;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryExample {
    public static void main(String[] args) {
        //Collection factory
       Set<String> colors = Set.of("red","green","blue");
        System.out.println(colors);

        Map<String,Integer> ages = Map.of("karina",25,"chaewon",24);
        System.out.println(ages);
    }
    /*private enum fruits {
        mango,apple,pineapple,pinemango
    }*/
}
