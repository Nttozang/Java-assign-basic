package oop.basic.polymor.Overriding;

public class Main {
    public static void main(String[] args){
        Animal myAn = new Animal();
        myAn.sound();

        CAT myCA = new CAT();
        myCA.sound();


        DOG myDo = new DOG();
        myDo.sound();

        myAn = new CAT();
        myAn.sound();

    }

}
