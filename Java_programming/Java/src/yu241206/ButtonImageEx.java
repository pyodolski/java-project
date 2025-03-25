package yu241206;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
    public ButtonImageEx() {
        // 창 제목 설정
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨테이너와 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout()); // 버튼을 FlowLayout으로 정렬

        // 아이콘 이미지 크기 조정
        ImageIcon normalIcon = resizeIcon(new ImageIcon("/Users/pyodolski/Desktop/Github/Java/Java_programming/Java/src/yu241206/call.png"), 50, 50);   // 기본 상태 아이콘
        ImageIcon rolloverIcon = resizeIcon(new ImageIcon("/Users/pyodolski/Desktop/Github/Java/Java_programming/Java/src/yu241206/call_hover.png"), 50, 50); // 마우스를 올릴 때의 아이콘
        ImageIcon pressedIcon = resizeIcon(new ImageIcon("/Users/pyodolski/Desktop/Github/Java/Java_programming/Java/src/yu241206/call_click.png"), 50, 50);  // 버튼을 누를 때의 아이콘

        // null 체크
        if (normalIcon == null || rolloverIcon == null || pressedIcon == null) {
            System.err.println("이미지를 로드할 수 없습니다.");
        }

        // 버튼 생성 및 기본 아이콘 설정
        JButton btn = new JButton("call~~", normalIcon);

        // Rollover 활성화
        btn.setRolloverEnabled(true);

        // 버튼 상태별 아이콘 설정
        btn.setPressedIcon(pressedIcon);       // 버튼을 누를 때의 아이콘
        btn.setRolloverIcon(rolloverIcon);     // 마우스를 버튼 위에 올릴 때의 아이콘

        // 버튼 추가
        c.add(btn);

        // 창 크기 설정 및 표시
        setSize(250, 150); // 창 크기 설정
        setVisible(true);  // 창 표시
    }

    // 이미지 크기를 조정하는 메서드
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.err.println("이미지를 로드할 수 없습니다: " + icon.getDescription());
            return null;
        }
        Image img = icon.getImage(); 
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    public static void main(String[] args) {
        new ButtonImageEx(); // 프로그램 실행
    }
}