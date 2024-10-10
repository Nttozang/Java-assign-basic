package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHasSet {
    public static void main(String[] args) {
        LinkedHashSet<Object> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        System.out.println(linkedSet);

        if(linkedSet.contains("Banana")){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
        linkedSet.remove("Cherry");
        System.out.println(linkedSet);
    }
}
