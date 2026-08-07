package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class MyHouse extends JFrame {

    // JPanel을 상속한 클래스
    MyImagePanel myImagePanel;

    // 생성자
    public MyHouse() {
        setTitle("내부 클래스 활용");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myImagePanel = new MyImagePanel();
        add(myImagePanel);

        setVisible(true);
    }

    // 정적 내부 클래스
    static class MyImagePanel extends JPanel {


        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.drawLine(150, 450, 350, 450);
            g.drawLine(120, 300, 380, 300);
            g.drawLine(150, 450, 150, 300); // x. 150(120) - 350(380)
            g.drawLine(350, 450, 350, 300); // y. 300 - 450

            g.drawLine(120,300,250,140); // 가로 중앙 250
            g.drawLine(380,300,250,140);

            g.drawLine(270,320,330,320);  // x. 270 - 330
            g.drawLine(270,345,330,345);
            g.drawLine(270,370,330,370);
            g.drawLine(270,370,270,320);
            g.drawLine(300,370,300,320);
            g.drawLine(330,370,330,320);

            g.drawLine(170, 350, 170, 450);
            g.drawLine(220, 350, 220, 450);
            g.drawLine(170, 350, 220, 350); // 세로 중앙 400

            g.drawOval(210,400,5,5);
        }

    } // end of inner


    // main
    public static void main(String[] args) {
        new MyHouse();
    }

}
