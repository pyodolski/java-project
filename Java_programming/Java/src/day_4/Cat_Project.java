package day_4;
class Cat_{
    private String sound;
    private int speed;
    private String color;
    private String sex;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void cry() {
        System.out.println("crying");
    }
    public void eat() {
        System.out.println("eating");
    }
    public void ddong() {
        System.out.println("ddonging");
    }


}
public class Cat_Project {
    public static void main(String[] args) {
        Cat_ myCat = new Cat_();
        myCat.setSound("meow");
        myCat.setSpeed(10);
        myCat.setColor("white");
        myCat.setSex("male");
        myCat.cry();
        myCat.eat();
        myCat.ddong();
    }
}
