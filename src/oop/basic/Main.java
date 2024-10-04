package oop.basic;

public class Main {
    public static void main(String[] args){
        car carA = new car(); //Instantiation
        car carB = new car();
        car carC = new car();

        carA.setCar(ColorofCar.RED);
        System.out.println(carA.getCar());

    }
}
