package oop.basic.association;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private List<Address> address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = new ArrayList<>();
    }
    public void addAddress(Address address){
        this.address.add(address);
    }

}
