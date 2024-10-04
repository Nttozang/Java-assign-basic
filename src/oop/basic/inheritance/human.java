package oop.basic.inheritance;

public class human extends Animal{

    public void walk(int steps){
        System.out.println("this "+ getName()+" walk "+ steps +" step");
    }
}
