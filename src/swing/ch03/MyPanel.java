package swing.ch03;

import com.oop14.C;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;


    // 패널 - 컴포넌트들을 그룹화
    // 패널마다 다른 배치 관리자 지정 가능
    private JPanel panel1;
    private JPanel panel2;

    public MyPanel() {
        setTitle("패널 연습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();

        setVisible(true);
    }

    private void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");

        panel1 = new JPanel();
        panel2 = new JPanel();
    }

    private void setInitLayout() {
        // 루트 패널에 배치 관리자 --> Grid 사용
        setLayout(new GridLayout(2,1)); // 격자 생성

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.YELLOW);

        super.add(panel1);
        super.add(panel2);

        panel1.add(button1);
        panel1.add(button2);

        panel2.add(button3);
        panel2.add(button4);
    }

    // 테스트 코드
    public static void main(String[] args) {

        MyPanel mp = new MyPanel();
    }
}
