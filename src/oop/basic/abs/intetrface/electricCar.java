package oop.basic.abs.intetrface;

class electricCar extends Car {

    @Override
    public void speedUp(int speed) {
        this.setSpeed(this.getSpeed() + speed);
    }

    @Override
    public void speedDown(int speed) {
        this.setSpeed(this.getSpeed() - speed);
    }

    @Override
    public void turnL() {
        System.out.println("pert left");
    }

    @Override
    public void turnR() {
        System.out.println("pert Right");
    }
}
