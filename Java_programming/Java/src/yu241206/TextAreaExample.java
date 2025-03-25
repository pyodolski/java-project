package yu241206;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame {
    private JTextArea displayArea; // 텍스트 영역
    public TextAreaExample() {
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(new JLabel("이름 "));
        JTextField nameField = new JTextField(20);
        c.add(nameField);
        c.add(new JLabel("학과 "));
        JTextField deptField = new JTextField("컴퓨터공학", 20);
        c.add(deptField);
        c.add(new JLabel("주소 "));
        JTextField addressField = new JTextField("경산시", 20);
        c.add(addressField);

        // 입력 내용을 표시할 텍스트 영역
        displayArea = new JTextArea(5, 20); // 5행, 25열
        displayArea.setEditable(false); // 읽기 전용 설정
        JScrollPane scrollPane = new JScrollPane(displayArea); // 스크롤 추가
        c.add(scrollPane);
        
        nameField.addActionListener(new TextFieldActionListener("이름", nameField));
        deptField.addActionListener(new TextFieldActionListener("학과", deptField));
        addressField.addActionListener(new TextFieldActionListener("주소", addressField));
        
        setSize(300, 250);
        setVisible(true);
    }

    class TextFieldActionListener implements ActionListener {
        private String label;
        private JTextField textField;
        public TextFieldActionListener(String label, JTextField textField) {
            this.label = label;
            this.textField = textField;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = textField.getText(); // 입력값 호출
            if (!input.isEmpty()) {
                displayArea.append(label + ": " + input + "\n");
                textField.setText(""); // 입력 필드 초기화
                displayArea.setCaretPosition(displayArea.getDocument().getLength()); // 스크롤 이동
            }
        }
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}