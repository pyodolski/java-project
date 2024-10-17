package day_6.Car_test;
class Wheel {
    private String position;
    public Wheel(String position) {
        this.position = position;
    }
    public void replace() {
        System.out.println("Replacing" + position + "wheel");
    }
}
class Engine {
    public void remove() {
        System.out.println("Removing engine");
    }
    public void replace() {
        System.out.println("Replacing engine");
    }
}

class Car {
    private Engine engine;
    private Wheel frontLeft;
    public Car() {
        engine = new Engine();
        frontLeft = new Wheel("front left");
    }
    public void replaceWheel() {
        engine.remove();
        frontLeft.replace();
        engine.replace();
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.replaceWheel();
    }
}
