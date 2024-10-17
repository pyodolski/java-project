package day_6.Car_test;

import java.util.Objects;

class Wheel_ {
    private String position;

    public Wheel_(String position) {
        this.position = position;
    }
    public void replace() {
        System.out.println("Replacing " + position + " wheel");
    }
}

class Engine_{
    private String type;
    public Engine_(String type) {
        this.type = type;
    }
    public void replace(String type) {
        System.out.println("Replacing" + type + "engine.");
    }
}
class Car_ {
    private Wheel_ frontLeftWheel;
    private Engine_ engine;
    public Car_() {
        frontLeftWheel = new Wheel_("Front");
        engine = new Engine_("V8");
    }
    public void replaceWheel() {
        frontLeftWheel.replace();
    }
    public void replaceEngine() {
        engine.replace("V8");
    }
}
public class Main_ {
    public static void main(String[] args) {
        Car_ myCar = new Car_();
        myCar.replaceWheel();
        myCar.replaceEngine();
    }
}
