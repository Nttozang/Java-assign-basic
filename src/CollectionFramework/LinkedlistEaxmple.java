package CollectionFramework;

import CollectionFramework.model.Person;

import java.util.LinkedList;

public class LinkedlistEaxmple {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        Person one = new Person("Sujin");
        Person two= new Person("yujin");

        System.out.println(linkedList.add(one));
        System.out.println(linkedList.add(two));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.size());
        System.out.println(linkedList.peek());

        for(var v : linkedList){
            System.out.println(v);
        }

    }
}
