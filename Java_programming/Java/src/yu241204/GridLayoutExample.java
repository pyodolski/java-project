package yu241204;

import java.awt.*; // AWT 패키지 import
import javax.swing.*; // Swing 패키지 import

// GridLayout 예제 클래스
public class GridLayoutExample extends JFrame {
    // 생성자: GridLayout을 사용한 GUI 설정
    public GridLayoutExample() {
        // 부모 클래스(JFrame)의 생성자 호출로 프레임 제목 설정
        super("GridLayout 예제");
        // 프레임 닫기 버튼 클릭 시 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 컨텐트팬 가져오기
        Container contentPane = getContentPane();
        // GridLayout 생성 및 설정
        // 1행 10열의 배치, 기본 간격은 0px
        contentPane.setLayout(new GridLayout(1, 10));
        // 10개의 버튼 생성 및 추가
        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text); // 버튼 생성
            contentPane.add(button); // 컨텐트팬에 버튼 추가
        }
        // 프레임 크기 설정
        setSize(500, 200);
        // 프레임 화면에 출력
        setVisible(true);
    }

    // main 메소드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        // GridLayoutEx 객체 생성 및 실행
        new GridLayoutExample();
    }
}