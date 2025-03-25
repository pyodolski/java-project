package yu241204;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    // MyFrame 생성자
    public MyFrame2() {
        // 프레임 제목 설정
        setTitle("ContentPane and Button Example");
        
        // 프레임 크기 설정
        setSize(400, 300);
        
        // 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 가져오기
        Container contentPane = getContentPane();
        
        // 버튼 컴포넌트 생성
        JButton button = new JButton("Click Me");

        // 버튼에 대한 이벤트 처리 (Optional)
        button.addActionListener(e -> {
            // 버튼 클릭 시 컨텐트팬을 새로운 MyPanel로 변경
            setContentPane(new MyPanel());
            revalidate(); // 컨텐트팬 갱신
            repaint(); // 화면 다시 그리기
        });

        // 컨텐트팬에 버튼 추가
        contentPane.add(button, BorderLayout.CENTER);

        // 프레임 표시
        setVisible(true);
    }

    // JPanel을 상속받은 MyPanel 클래스
    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // 패널의 배경 색 설정
            setBackground(Color.LIGHT_GRAY);

            // 패널에 텍스트 그리기
            g.setColor(Color.BLACK);
            g.drawString("Welcome to the new Panel!", 100, 100);
        }
    }

    // main 메소드: 프로그램 실행의 시작점
    public static void main(String[] args) {
        new MyFrame(); // MyFrame 객체 생성 및 실행
    }
}