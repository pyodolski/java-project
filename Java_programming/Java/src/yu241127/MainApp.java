package yu241127;

public class MainApp {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("java ./ProcessApp.java");
            int exitCode = process.waitFor(); // MainApp의 종료 상태 코드를 가져옴
            if (exitCode == 0) {
                System.out.println("MainApp 종료: 정상 종료");
            } else {
                System.out.println("MainApp 종료: 비정상 종료 (코드 " + exitCode + ")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
