package yu241206;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");

        // 컨테이너와 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 버튼 생성
        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton("Disabled Button");
        JButton b3 = new JButton("getX(), getY()");

        // b1 버튼의 배경색, 글자색, 폰트 설정
        b1.setBackground(Color.YELLOW);               // 배경색 설정
        b1.setForeground(Color.MAGENTA);              // 글자색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // 글꼴과 스타일 설정

        // b2 버튼 비활성화
        b2.setEnabled(false);                         // 버튼 클릭 불가로 설정

        // b3 버튼 클릭 이벤트 리스너 추가
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();  // 이벤트가 발생한 버튼을 가져옴
                setTitle(b.getX() + ", " + b.getY()); // 버튼의 x, y 좌표를 창 제목으로 설정
            }
        });

        // 컨테이너에 버튼 추가
        c.add(b1);
        c.add(b2);
        c.add(b3);

        // 창 크기와 가시성 설정
        setSize(260, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx(); // 프로그램 실행
    }
}