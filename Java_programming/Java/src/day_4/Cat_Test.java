package day_4;
class Cat {
    String name;
    int age;


    public void setCat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }
    public void meow(){
        System.out.println("Nya!");
    }
}
class RussianBlue extends Cat {
    public void meow() {
        System.out.println("Meow~");
    }
    private String color = "Gray";
}
class KoreanShorthair extends Cat {
    public void meow(){
        System.out.println("Korean~");
    }
}
public class Cat_Test {
    public static void main(String[] args) {
//        Cat cat_00 = new Cat();
//        cat_00.name = "Nero";
//        cat_00.age = 3;
//
//        Cat cat_01 = new Cat();
//        cat_01.name = "Oscar";
//        cat_01.age = 2;
//
//        RussianBlue cat_02 = new RussianBlue();
//        cat_02.setCat("Coco", 1);
//        cat_02.printInfo();
        RussianBlue R1 = new RussianBlue();
        R1.meow();

        KoreanShorthair K1 = new KoreanShorthair();
        K1.meow();
    }
}
