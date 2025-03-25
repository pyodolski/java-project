package yu241206;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3]; // 체크박스 배열
    private String[] names = {"사과", "배", "체리"}; // 과일 이름
    private JLabel sumLabel; // 합계를 표시하는 라벨

    public CheckBoxItemEventEx() {
        // 창 제목 설정
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨테이너 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 상단에 과일 가격 안내 라벨 추가
        c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

        // ItemListener 생성
        MyItemListener listener = new MyItemListener();

        // 체크박스 생성 및 설정
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]); // 체크박스 생성
            fruits[i].setBorderPainted(true);   // 체크박스 테두리 표시
            c.add(fruits[i]);                   // 컨테이너에 추가
            fruits[i].addItemListener(listener); // ItemListener 연결
        }

        // 합계를 표시할 라벨 생성 및 추가
        sumLabel = new JLabel("현재 0 원 입니다.");
        c.add(sumLabel);

        // 창 크기 및 표시 설정
        setSize(250, 200); // 창 크기
        setVisible(true);  // 창 표시
    }

    // ItemListener 구현 클래스
    class MyItemListener implements ItemListener {
        private int sum = 0; // 현재 가격의 합계를 저장

        @Override
        public void itemStateChanged(ItemEvent e) {
            // 체크박스가 선택되었는지 확인
            if (e.getStateChange() == ItemEvent.SELECTED) {
                // 선택된 체크박스에 따라 합계를 추가
                if (e.getItem() == fruits[0]) {
                    sum += 100; // 사과 100원
                } else if (e.getItem() == fruits[1]) {
                    sum += 500; // 배 500원
                } else {
                    sum += 20000; // 체리 20000원
                }
            } else {
                // 선택 해제된 체크박스에 따라 합계를 감소
                if (e.getItem() == fruits[0]) {
                    sum -= 100; // 사과 100원
                } else if (e.getItem() == fruits[1]) {
                    sum -= 500; // 배 500원
                } else {
                    sum -= 20000; // 체리 20000원
                }
            }

            // 합계 라벨 업데이트
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx(); // 프로그램 실행
    }
}