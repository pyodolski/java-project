package day_3;

public class Continue {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }
    }
}
