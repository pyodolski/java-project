package day_3;

public class Array_2 {
    public static void main(String[] args) {
        int[][] arr_score = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr_score[0][1]);
        System.out.println(arr_score[1][2]);

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr_score[i][j]);
            }
        }
    }
}
