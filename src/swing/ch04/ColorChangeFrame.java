package swing.ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel1 = new JPanel();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel1.setBackground(Color.YELLOW);
        panel1.add(button1);
        panel1.add(button2);

        add(panel1);
        setVisible(true);
    }

    private void addEventListener() {
        // button1 객체에 이벤트 리스너 등록 -> actionPerformed() 메서드 콜백
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // ActionListener의 추상 메서드를 구현 메서드로 재정의
    // 미리 약속된 메서드
    // 즉, 어떤 이벤트 발생 시 해당 메서드가 동작 (콜백 메서드)
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("actionPerformed() 메서드 호출(콜백)");
        // System.out.println(e.getSource());
        // JButton selectedButton = (JButton) e.getSource();
        Object source = e.getSource();
        if (source == button1) {
            panel1.setBackground(Color.CYAN);
        } else if (source == button2) {
            panel1.setBackground(Color.LIGHT_GRAY);
        }
    }

    // main
    public static void main(String[] args) {

        new ColorChangeFrame();
        // 메서드를 일반적으로 호출 a.abc();
        // 어떤 이벤트가 발생하면 콜백되어서 동작함


    }
}
