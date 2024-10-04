package oop.basic.abs;

 class PetrolCar extends Car {
    @Override
    void speedUp(int speed) {
        this.setSpeed(this.getSpeed() + speed);
    }

    @Override
    void speedDown(int speed) {
        this.setSpeed(this.getSpeed() - speed);
    }

    @Override
    void turnL() {
        System.out.println("pert left");
    }

    @Override
    void turnR() {
        System.out.println("pert Right");
    }
}
