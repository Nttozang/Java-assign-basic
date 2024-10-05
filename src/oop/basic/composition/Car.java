package oop.basic.composition;

public class Car {
    private final String brand;
    private final Engie engie;

    public Car(String brand) {
        this.brand = brand;
        this.engie = new Engie("E",2000);
    }

    public String getBrand() {
        return brand;
    }

    public Engie getEngie() {
        return engie;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engie=" + engie +
                '}';
    }
}
