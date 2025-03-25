package yu241206;

import javax.swing.*;
import java.awt.*;

public class ContainerAndComponentExample extends JFrame {
    public ContainerAndComponentExample() {
        setTitle("Container & Component");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 250);
        setLayout(new BorderLayout());

        // 왼쪽 패널
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 2, 10, 10)); // 3행 2열, 간격 설정
        leftPanel.setBackground(Color.YELLOW);
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 내부 여백 설정

        JLabel lblId = new JLabel("Type ID");
        JTextField tfId = new JTextField(10);
        JLabel lblPassword = new JLabel("Type Password");
        JTextField tfPassword = new JTextField(10);

        leftPanel.add(lblId);
        leftPanel.add(tfId);
        leftPanel.add(lblPassword);
        leftPanel.add(tfPassword);

        // 오른쪽 패널
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS)); // 수직 배치
        rightPanel.setBackground(Color.GREEN);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 내부 여백 설정

        JLabel lblProgram = new JLabel("좋아하는 프로그램");
        JCheckBox cbJava = new JCheckBox("Java 프로그램");
        JCheckBox cbCpp = new JCheckBox("C++ 프로그램");

        rightPanel.add(lblProgram);
        rightPanel.add(cbJava);
        rightPanel.add(cbCpp);

        // OK 버튼
        JPanel bottomPanel = new JPanel();
        JButton btnOk = new JButton("OK");
        bottomPanel.add(btnOk);

        // 메인 프레임에 추가
        add(leftPanel, BorderLayout.WEST);  // 왼쪽
        add(rightPanel, BorderLayout.EAST); // 오른쪽
        add(bottomPanel, BorderLayout.SOUTH); // 아래

        setVisible(true);
    }

    public static void main(String[] args) {
        new ContainerAndComponentExample();
    }
}