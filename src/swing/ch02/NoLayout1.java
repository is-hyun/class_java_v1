package swing.ch02;

import javax.swing.*;

public class NoLayout1 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayout1() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    private void initData() {
        button1 = new JButton("button1");
    }

    private void setInitLayout() {
        // setLayout에 null  >> 자표 기반으로 배치 가능
        setLayout(null);

        // ! 주의 - 자표 기반 배치 관리자를 사용하면
        // 반드시 컴포넌트의 크기와 x축 / y축을 지정해야 한다

        button1.setSize(100,100);
        button1.setLocation(200,200);

        add(button1);

        setVisible(true);
    }

}
