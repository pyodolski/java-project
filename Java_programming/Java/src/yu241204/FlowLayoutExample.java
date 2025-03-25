package yu241204;

import javax.swing.*; // Swing 패키지 import
import java.awt.*; // AWT 패키지 import

// FlowLayout 예제 클래스
public class FlowLayoutExample extends JFrame {
    // 생성자: FlowLayout을 사용한 GUI 설정
    public FlowLayoutExample() {
        // 프레임 제목 설정
        setTitle("FlowLayout 예제");

        // 프레임 닫기 버튼 클릭 시 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 가져오기
        Container contentPane = getContentPane();

        // FlowLayout 생성 및 설정
        // 왼쪽 정렬, 수평 간격 30픽셀, 수직 간격 40픽셀
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        // 컨텐트팬에 버튼 추가
        contentPane.add(new JButton("add"));       // 덧셈 버튼
        contentPane.add(new JButton("sub"));       // 뺄셈 버튼
        contentPane.add(new JButton("mul"));       // 곱셈 버튼
        contentPane.add(new JButton("div"));       // 나눗셈 버튼
        contentPane.add(new JButton("Calculate")); // 계산 버튼

        // 프레임 크기 설정
        setSize(300, 200);

        // 프레임 화면에 출력
        setVisible(true);
    }

    // main 메소드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        // FlowLayoutEx 객체 생성 및 실행
        new FlowLayoutExample();
    }
}