package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    // JPanel을 상속한 클래스
    MyImagePanel myImagePanel;

    // 생성자
    public MyImageFrame() {
        setTitle("내부 클래스 활용");
        setSize(500,600);
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

            g.drawString("이미지게임", 200,200);
            g.drawLine(100, 100,300,100);
        }

    } // end of inner


    // main
    public static void main(String[] args) {
        new MyImageFrame();
    }

}
