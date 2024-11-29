package yu241127;

public class ProcessApp {
    public static void main(String[] args) {
        int condition = 1; // 조건에 따라 변경 가능
        if (condition == 1) {
            System.exit(1); // 비정상 종료
        } else {
            System.exit(0); // 정상 종료
        }
    }
}
