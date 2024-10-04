package oop.basic.polymor.Overloading;

import oop.basic.ColorofCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(ColorofCar.RED,"aa");
        System.out.println(car.getColor());
        System.out.println(car.getBrand());
    }

}
