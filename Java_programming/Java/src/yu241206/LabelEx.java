package yu241206;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        // 창 제목 설정
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨테이너에 BoxLayout 설정
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

        // "제임스 고슬링 입니더!" 텍스트를 중앙 정렬로 추가
        JLabel textLabel = new JLabel("제임스 고슬링 입니더!", SwingConstants.CENTER); // 가운데 정렬
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // 수평 중앙 정렬
        c.add(textLabel);

        // 이미지 추가
        ImageIcon img = new ImageIcon("/Users/pyodolski/Desktop/Github/Java/Java_programming/Java/src/yu241206/gosling.png");
        JLabel imageLabel = new JLabel(img);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // 수평 중앙 정렬
        c.add(imageLabel);

        // 텍스트와 아이콘을 아래쪽에 추가
        ImageIcon icon = new ImageIcon("/Users/pyodolski/Desktop/Github/Java/Java_programming/Java/src/yu241206/call.png");
        JLabel label = new JLabel("커피한잔 하실래예, 전화주이소", icon, SwingConstants.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT); // 수평 중앙 정렬
        c.add(label);

        // 창 크기 설정 및 표시
        setSize(600, 800); // 창 크기 조정
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}