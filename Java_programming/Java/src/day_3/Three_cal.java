package day_3;

import java.util.Random;

public class Three_cal {
    public static void main(String[] args) {
        int score = 95;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(grade);
    }
}
