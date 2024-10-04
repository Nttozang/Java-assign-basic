package oop.basic.inheritance;

public class Main{

    public static void main(String[] args){

        Cat myCat = new Cat();
        myCat.setName("Mean");
        myCat.speak();


        Dog myDog = new Dog();
        myDog.setName("hong hong");
        myDog.speak();

        human myHuman = new human();
        myHuman.setName("nut");
        myHuman.speak();

        human myHumanWalk = new human();
        myHuman.walk(10);

        Developer myDev = new Developer();
        myDev.setName("karina");
        myDev.walk(9);
    }


}
