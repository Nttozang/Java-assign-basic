package oop.basic.abs.intetrface;

class Car implements ChangeSpeed,Turn {

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

    @Override
    public void speedUp(int speed) {

    }

    @Override
    public void speedDown(int speed) {

    }

    @Override
    public void turnL() {

    }

    @Override
    public void turnR() {

    }
}
