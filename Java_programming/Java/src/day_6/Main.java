package day_6;
import day_6_test.Car;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari");
        car1.startEngine();

        day_6_test.Car car2 = new day_6_test.Car("BMW");
        car2.startEngine();
        // car2.stopEngine(); void, protested X
    }
}
