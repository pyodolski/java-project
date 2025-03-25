package yu241206;

import javax.swing.*;
import java.awt.*;

public class TextFieldExample extends JFrame {
    public TextFieldExample() {
        // 창 제목 설정
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨테이너와 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout()); // FlowLayout으로 컴포넌트 배치

        // "이름" 라벨과 텍스트 필드 추가
        c.add(new JLabel("이름 "));          // 라벨 추가
        c.add(new JTextField(20));          // 길이가 20인 빈 텍스트 필드 추가

        // "학과" 라벨과 텍스트 필드 추가
        c.add(new JLabel("학과 "));         // 라벨 추가
        c.add(new JTextField("컴퓨터공학과", 20)); // 초기값이 "컴퓨터공학과"인 텍스트 필드 추가

        // "주소" 라벨과 텍스트 필드 추가
        c.add(new JLabel("주소 "));         // 라벨 추가
        c.add(new JTextField("경산시 ...", 20));   // 초기값이 "서울시 ..."인 텍스트 필드 추가

        // 창 크기 및 표시 설정
        setSize(300, 150); // 창 크기 설정
        setVisible(true);  // 창 표시
    }

    public static void main(String[] args) {
        new TextFieldExample(); // 프로그램 실행
    }
}