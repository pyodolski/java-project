package day_4;

import javax.swing.table.TableRowSorter;

abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}
class Dogs extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
class Cats extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}
public class Animal_Test {
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        Animal myCat = new Cats();
        myDog.sound();
        myCat.sound();
        myDog.sleep();
        myCat.sleep();
    }
}
