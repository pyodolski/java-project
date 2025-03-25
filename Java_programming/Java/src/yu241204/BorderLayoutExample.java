package yu241204;

import javax.swing.*; // Swing 패키지 import
import java.awt.*;    // AWT 패키지 import

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        // BorderLayout 생성 및 설정
        // 수평 간격 30픽셀, 수직 간격 20픽셀
        contentPane.setLayout(new BorderLayout(30, 20));
        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER); // 중앙에 버튼 추가
        contentPane.add(new JButton("add"), BorderLayout.NORTH);        // 상단에 버튼 추가
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);        // 하단에 버튼 추가
        contentPane.add(new JButton("mul"), BorderLayout.EAST);         // 오른쪽에 버튼 추가
        contentPane.add(new JButton("div"), BorderLayout.WEST);         // 왼쪽에 버튼 추가
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}