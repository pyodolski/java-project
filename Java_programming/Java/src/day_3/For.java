package day_3;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("1~100의 힙:" + sum);
    }
}
