package day_8;
class Animal {

}
class Dog extends Animal {

}
class Cat extends Animal {

}
public class ClassCastExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        try{
            Cat myCat = (Cat) myAnimal;
        }catch(ClassCastException e){
            System.out.println("ClassCastException 발생");
        }
    }
}
