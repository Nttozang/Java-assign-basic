package CollectionFramework;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("oine");
        set.add("two");
        set.add("oine");
        set.add("three");
        set.add("three");
        System.out.println(set);
        if(set.contains("twoe")){
            System.out.println("have two");
        }else {
            System.out.println("not have two");
        }
        set.remove("oine");
        System.out.println(set);
        System.out.println(set.size());
    }
}
