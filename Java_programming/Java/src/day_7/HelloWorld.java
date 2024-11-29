package day_7;
abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
interface Pet {
    void sound();
    void play();
}
interface Wild {
    void hunt();
    void sound();
}
class Dog extends Animal implements Pet, Wild {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    @Override
    public void play() {
        System.out.println("네네네");
    }
    @Override
    public void hunt() {
        System.out.println("사냥하기");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        Animal myDog = new Dog("하나");
        ((Pet)myDog).play();
        ((Wild)myDog).hunt();
        ((Wild)myDog).sound();

    }
}
