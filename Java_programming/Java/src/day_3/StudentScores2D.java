package day_3;

import java.util.Scanner;

public class StudentScores2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = 5;
        int subjects = 3;

        int[][] scores = new int[students][subjects];
        int totalSum = 0;
        for(int i = 0; i < students; i++) {
            int studentSum = 0;
            System.out.println((i + 1) + "번째 학생의 점수를 입력하세요 : ");
            for (int j = 0; j < subjects; j++) {
                System.out.println("과목 " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
                studentSum += scores[i][j];
            }
            totalSum += studentSum;
            double studentAverage = studentSum / (double) students;
            System.out.println("학생 " + (i + 1) + "의 총점:" + studentSum
             + ", 평균:" + studentAverage);
            System.out.println();
        }
        double totalAverage = totalSum / (double) (students + subjects);
        System.out.println("전체 학생의 평균 점수:" + totalAverage);
    }
}
