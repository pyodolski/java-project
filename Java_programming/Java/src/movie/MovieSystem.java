
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieSystem {
    public static void main(String[] args) {
        new MyJFrame(); // 프로그램 실행
    }

    public static class MyJFrame extends JFrame {
        private JPanel moviePanel; // 영화 선택 버튼 패널
        private JPanel seatPanelContainer; // 좌석 선택 표시 패널
        private JPanel bottomPanel; // 좌석 선택 버튼 패널
        private JLabel reservationLabel; // 예약 확인 표시 라벨

        // 각 영화의 좌석 패널
        private JPanel seatPanel1;
        private JPanel seatPanel2;
        private JPanel seatPanel3;

        public MyJFrame() {
            setTitle("영화 예매 시스템"); // 타이틀 설정
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 기능 설정
            setSize(1000, 900); // 창 크기 설정
            setLayout(new BorderLayout()); // 레이아웃 설정

            moviePanel = new JPanel(); // 영화 선택 버튼 패널설정
            moviePanel.setLayout(new BoxLayout(moviePanel, BoxLayout.Y_AXIS)); // 세로 정렬
            moviePanel.setPreferredSize(new Dimension(250, 700)); // 객체로 패널 크기설정
            // 일반적인 크기 설정으로 크기 설정이 안되어서 추가적인 검색 후 객체로 사이즈 설정하였습니다

            JButton movie1Button = new JButton("영화 1 (10:00)AM");
            JButton movie2Button = new JButton("영화 2 (12:00)PM");
            JButton movie3Button = new JButton("영화 3 (3:00)PM");

            Dimension buttonSize = new Dimension(250, 300); // 버튼 사이즈 객체로 사이즈 설정

            movie1Button.setMaximumSize(buttonSize);
            movie2Button.setMaximumSize(buttonSize);
            movie3Button.setMaximumSize(buttonSize);

            moviePanel.add(movie1Button); // 버튼 추가
            moviePanel.add(movie2Button);
            moviePanel.add(movie3Button);

            movie1Button.addActionListener(new ActionListener() {
                // 버튼 액션 추가
                @Override
                public void actionPerformed(ActionEvent e) {
                    showSeatPanel("영화 1");
                }
            });
            movie2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showSeatPanel("영화 2");
                }
            });
            movie3Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showSeatPanel("영화 3");
                }
            });

            add(moviePanel, BorderLayout.WEST); // 왼쪽에 추가

            seatPanelContainer = new JPanel(); // 좌석 선택 버튼
            seatPanelContainer.setLayout(new CardLayout());

            seatPanel1 = createSeatPanel();
            seatPanel2 = createSeatPanel();
            seatPanel3 = createSeatPanel();

            seatPanelContainer.add(seatPanel1, "영화 1");
            seatPanelContainer.add(seatPanel2, "영화 2");
            seatPanelContainer.add(seatPanel3, "영화 3");

            add(seatPanelContainer, BorderLayout.CENTER);

            bottomPanel = new JPanel(); // 왼쪽 하단에 좌석 예약 표시 패널 생성
            bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

            reservationLabel = new JLabel("좌석을 선택하세요.");

            bottomPanel.add(reservationLabel);
            add(bottomPanel, BorderLayout.SOUTH);

            setVisible(true);
        }

        private JPanel createSeatPanel() { // 영화 마다 각각의 좌석 패널 초기 설정
            JPanel seatPanel = new JPanel();
            seatPanel.setLayout(new BorderLayout());

            JLabel seatLabel = new JLabel("좌석 선택", SwingConstants.LEFT);
            seatPanel.add(seatLabel, BorderLayout.NORTH);
            seatLabel.setBackground(Color.GRAY);
            seatLabel.setOpaque(true); // setBackground()로 적용이 안되어서 투명 옵션 설정

            JPanel seatGridPanel = new JPanel();
            seatGridPanel.setLayout(new GridLayout(5, 10, 10, 10));
            seatGridPanel.setBackground(Color.GRAY);

            for (int i = 1; i <= 5; i++) { // 반복문을 통한 좌석 번호 생성
                for (int j = 1; j <= 10; j++) {
                    JButton seatButton = new JButton(i + "-" + j);
                    seatButton.setBackground(Color.GREEN);
                    seatButton.setOpaque(true);
                    seatButton.setPreferredSize(new Dimension(60, 60));
                    seatButton.setFocusPainted(false);

                    seatButton.addActionListener(new ActionListener() {
                        // 좌석 버튼 이벤트 생성 버튼 클릭시 RED로 색상 변경
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            seatButton.setBackground(Color.RED);
                            reservationLabel.setText("좌석 " + seatButton.getText() + " 예약 완료!");
                        }
                    });

                    seatGridPanel.add(seatButton);
                }
            }

            seatPanel.add(seatGridPanel, BorderLayout.CENTER);

            return seatPanel;
        }

        private void showSeatPanel(String movieName) {
            // 좌석 선택 시 해당 좌석 번호를 표시하기 위한 함수
            CardLayout cardLayout = (CardLayout) seatPanelContainer.getLayout();
            cardLayout.show(seatPanelContainer, movieName);
        }
    }
}
