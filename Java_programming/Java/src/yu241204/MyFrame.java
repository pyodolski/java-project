package yu241204;

import javax.swing.*; // Swing 라이브러리 import

// MyFrame 클래스 정의: JFrame을 상속받아 커스텀 프레임 생성
public class MyFrame extends JFrame {
    // MyFrame 생성자
    public MyFrame() {
        // 프레임의 제목 설정
        setTitle("300x300 스윙 프레임 만들기");
        // 프레임 크기 설정 (가로 300px, 세로 300px)
        setSize(300, 300);
        // 프레임을 화면에 표시
        setVisible(true);
    }

    // main 메소드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        // MyFrame 객체 생성
        MyFrame mf = new MyFrame();
    }
}
