package oop.basic.association;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("nu",25);
        Person p2 = new Person("nu",27);

        Address a1 = new Address("tokyo","7000");
        Address a2 = new Address("france","eee");

        p1.addAddress(a1);
        p2.addAddress(a1);
    }

}
