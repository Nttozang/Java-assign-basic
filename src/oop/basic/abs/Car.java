package oop.basic.abs;

import oop.basic.ColorofCar;

 abstract class Car {

    private String color;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    abstract void speedUp(int speed);
    abstract void speedDown(int speed);
    abstract void turnL();
    abstract void turnR();
}
