package day_6_test;

public class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println(model + " engine start");
    }
    public void accelerate() {
        System.out.println(model + " accelerate");
    }
    void stopEngine() {
        System.out.println(model + " engine stop");
    }
}
