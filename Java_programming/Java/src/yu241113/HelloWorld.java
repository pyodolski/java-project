package yu241113;

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
    void sound();
    void hunt();
}

class Dog extends Animal implements Pet, Wild {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Bow Wow!");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        ((Pet)myDog).sound();
        ((Wild)myDog).hunt();
        ((Pet) myDog).play();
        ((Wild) myDog).hunt();
    }
}
