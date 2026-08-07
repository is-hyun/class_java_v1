package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBorderFrame2 extends JFrame {

    private JButton[] buttons = new JButton[5];
    private String[] region = new String[]{
            BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER, BorderLayout.WEST, BorderLayout.EAST
    };


    private BorderLayout borderLayout;

    public MyBorderFrame2() {

        setTitle("boarderLayout 연습");
        setSize(600, 400);

        // X 버튼으로 프로그램까지 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();

        setVisible(true);
    }

    public void initData() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }

        borderLayout = new BorderLayout();
    }

    public void setInitLayout() {

        setLayout(borderLayout); // Frame에 배치관리자 설정

        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], region[i]);
        }

    }

}