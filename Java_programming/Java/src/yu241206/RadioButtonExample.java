package yu241206;

import javax.swing.*;
import java.awt.*;

public class RadioButtonExample extends JFrame {
    public RadioButtonExample() {
        // 창 제목 설정
        setTitle("라디오버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨테이너와 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout()); // FlowLayout으로 컴포넌트 배치

        // 버튼 그룹 객체 생성
        ButtonGroup g = new ButtonGroup();

        // 라디오 버튼 생성
        JRadioButton apple = new JRadioButton("사과");          // 기본값: 선택되지 않음
        JRadioButton pear = new JRadioButton("배", true);      // 기본값: 선택됨
        JRadioButton cherry = new JRadioButton("체리");        // 기본값: 선택되지 않음

        // 버튼 그룹에 라디오 버튼 추가 (그룹화)
        g.add(apple);
        g.add(pear);
        g.add(cherry);

        // 컨테이너에 라디오 버튼 추가
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        // 창 크기 설정 및 표시
        setSize(250, 150); // 창 크기
        setVisible(true);  // 창 표시
    }

    public static void main(String[] args) {
        new RadioButtonExample(); // 프로그램 실행
    }
}