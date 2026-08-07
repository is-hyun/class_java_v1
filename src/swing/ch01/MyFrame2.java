package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {

    private JButton[] buttons = new JButton[4];

    public MyFrame2() {
        super.setTitle("배치 관리자 연습");
        super.setSize(500, 500);
        super.setVisible(true);

        initData(); // 합성 관계
        setInitLayout();
    }

    public void initData() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }

    }

    public void setInitLayout() {
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();
        // 컴포넌트들을 수평 / 수직으로 프레임 배치
        super.setLayout(flowLayout);
        for (int i = 0; i < buttons.length; i++) {
            super.add(buttons[i]);
        }
    }

    // main 테스트
    public static void main(String[] args) {

        new MyFrame2(); // >> 생성자에 있는 로직이 동작

    }

}
