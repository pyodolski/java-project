package day_5;

class Car {
    String name;
    String color;
    int price;
    int year;
    float speed;
    Car() {

    }
    Car(int speed) {
        this.speed = 120;
        this.name = "BMW";
    }
}
public class Car_Test {
    public static void main(String[] args) {
        System.out.println("Hello, Carbot!");
        Car car_00 = new Car();
        car_00.name = "BMW";
        car_00.color = "Black";
        car_00.price = 1000000;
        car_00.year = 2020;
        car_00.speed = 300;
        System.out.println(car_00.name);
        System.out.println(car_00.color);
        System.out.println(car_00.price);
        System.out.println(car_00.year);
        System.out.println(car_00.speed);
        Car car_01 = new Car(200);
        System.out.println(car_01.name);
        System.out.println(car_01.color);
        System.out.println(car_01.price);
        System.out.println(car_01.year);
        System.out.println(car_01.speed);
    }
}