package yu241204;

import javax.swing.*; // Swing 라이브러리 import

// GUI 예제 클래스
public class GuiExample {
    public static void main(String[] args) {
	// JFrame 객체 생성: "This is frame" 제목으로 프레임 생성
        JFrame frame = new JFrame("This is frame");

        // JLabel 객체 생성: "Hello World"라는 텍스트를 표시
        JLabel label = new JLabel("Hello World");

        // 프레임에 JLabel 추가
        frame.add(label);

        // 프레임 크기를 내용물에 맞게 자동 조정
        frame.pack();

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}