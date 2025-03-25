package yu241204;

import javax.swing.*; // Swing 패키지 import
import java.awt.*;    // AWT 패키지 import

// NullContainerEx 클래스: 배치관리자 없이 절대 위치에 컴포넌트 배치
public class NullContainerExample extends JFrame {
    // 생성자: 절대 위치를 사용한 GUI 설정
    public NullContainerExample() {
        // 프레임 제목 설정
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");

        // 프레임 닫기 버튼 클릭 시 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 가져오기
        Container contentPane = getContentPane();

        // 컨텐트팬의 배치관리자 제거
        contentPane.setLayout(null);

        // JLabel 생성 및 설정
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50); // 라벨의 위치 (130, 50)
        la.setSize(200, 20);     // 라벨의 크기 200x20
        contentPane.add(la);     // 라벨을 컨텐트팬에 추가

        // 9개의 버튼 생성 및 추가
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i)); // 버튼 생성
            b.setLocation(i * 15, i * 15); // 버튼 위치 설정 (서로 겹침)
            b.setSize(50, 20);            // 버튼 크기 설정 50x20
            contentPane.add(b);           // 버튼을 컨텐트팬에 추가
        }

        // 프레임 크기 설정
        setSize(300, 200);

        // 프레임 화면에 출력
        setVisible(true);
    }

    // main 메소드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        // NullContainerEx 객체 생성 및 실행
        new NullContainerExample();
    }
}