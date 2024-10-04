package oop.basic.polymor.Overloading;

import oop.basic.ColorofCar;

public class Car {

    private ColorofCar color;
    private String brand;
    private int tires;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ColorofCar getColor() {
        return color;
    }

    public void setColor(ColorofCar color) {
        this.color = color;
    }

    public Car(){

    }
    public Car(ColorofCar color,String brand,int tires){
        this.color = color;
        this.brand = brand;
        this.tires = tires;
    }

    public Car(ColorofCar color,String brand){
        this(color,brand,4);
    }


}
