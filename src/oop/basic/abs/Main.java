package oop.basic.abs;

 class Main {
    public static void main(String[] args){
        Car petrolCar = new PetrolCar();
        petrolCar.setColor("black");
        System.out.println(petrolCar.getColor());
        petrolCar.turnL();
        petrolCar.turnR();

        Car electricCar = new electricCar();
        electricCar.setColor("blue");
        System.out.println(electricCar.getColor());



    }

}
