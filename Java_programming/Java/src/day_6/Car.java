package day_6;

public class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println(model + " engine start");
    }
    protected void accelerate() {
        System.out.println(model + " accelerate");
    }
    void stopEngine() {
        System.out.println(model + " engine stop");
    }
}
