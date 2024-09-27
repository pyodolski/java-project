package day_5;

public class HelloWorld {
    public static class Car {
        Car() {
            this.name = "Avante";
            this.speed = 100.0f;
        }
        Car(int speed) {
            this.speed = speed;
            this.name = "Sonata";
        }
        Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
        String name;
        String color;
        int year;
        float speed;
        int price;
        void print() {
            System.out.println("name: " + this.name);
            System.out.println("speed: " + this.speed);
            System.out.println("color: " + this.color);
            System.out.println("year: " + this.year);
            System.out.println("price: " + this.price);
        }
    }

    public static void main(String[] args) {
        Car myCar_00 = new Car();
        Car myCar_01 = new Car(200);
        Car myCar_02 = new Car("BMW", 300);
        myCar_00.print();
        myCar_01.print();
        myCar_02.print();
    }
}