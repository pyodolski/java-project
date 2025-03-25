package yu241204;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel 생성 (GridLayout 사용)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // 컴포넌트 생성
        JLabel num1Label = new JLabel("Number 1:");
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Number 2:");
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // 결과 필드는 읽기 전용

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");

        // 이벤트 처리
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // 컴포넌트를 패널에 추가
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);

        // 패널을 프레임에 추가
        frame.add(panel);

        // 프레임 표시
        frame.setVisible(true);
    }
}