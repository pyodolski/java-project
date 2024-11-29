package yu241129;

public class SystemOutErrExample {
    public static void main(String[] args) {
        // 표준 출력 - 정상적인 작업 과정 출력
        System.out.println("프로그램 시작");

        try {
            // 정상 동작 출력
            System.out.println("1. 숫자 계산 시작");
            int result = divide(10, 2); // 정상 계산
            System.out.println("2. 계산 결과: " + result);

            // 의도적으로 예외 발생 (0으로 나누기)
            System.out.println("3. 숫자 계산 시작 (예외 발생)");
            result = divide(10, 0);

        } catch (ArithmeticException e) {
            // 표준 에러 출력 - 에러 메시지 출력
            System.err.println("에러 발생: " + e.getMessage());
        }

        // 프로그램 종료 메시지
        System.out.println("프로그램 종료");
    }

    // 나눗셈 메서드
    public static int divide(int a, int b) {
        return a / b; // 0으로 나눌 경우 ArithmeticException 발생
    }
}