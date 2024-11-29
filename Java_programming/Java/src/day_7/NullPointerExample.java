package day_7;

public class NullPointerExample {
    public static void main(String[] args) {
        String text = null;
        if (text != null) {
            System.out.println(text);
        } else {
            System.out.println("Null입니다.");
        }
    }
}
