package day_7;
class Printer {
    public void print(String message)   {
        System.out.println(message);
    }
    public void print(int number) {
        System.out.println(number);
    }
}
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(123);
    }
}
