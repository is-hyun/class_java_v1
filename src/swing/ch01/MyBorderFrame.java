package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBorderFrame extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private BorderLayout borderLayout;

    public MyBorderFrame() {

        setTitle("boarderLayout 연습");
        setSize(600, 400);

        // X 버튼으로 프로그램까지 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();

        setVisible(true);
    }

    public void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        button5 = new JButton("button5");

        borderLayout = new BorderLayout();
    }

    public void setInitLayout() {

        setLayout(borderLayout); // Frame에 배치관리자 설정

        // 보더 레이아웃은 add를 사용할 때, 동/서/남/북/중앙 을 명시해야 한다
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.CENTER);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.EAST);
    }

}
