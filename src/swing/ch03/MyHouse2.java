package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class MyHouse2 extends JFrame {

    // JPanel을 상속한 클래스
    MyImagePanel myImagePanel;

    // 생성자
    public MyHouse2() {
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

            int[] X_Square = {150, 350, 350, 150};
            int[] Y_Squre = {300, 300, 450, 450};
            g.drawPolygon(X_Square, Y_Squre,4);

            int[] X_Tri = {120, 250, 380};
            int[] Y_Tri = {300, 140, 300};
            g.drawPolygon(X_Tri, Y_Tri,3);

            int[] X_Win = {270, 330, 330, 270};
            int[] Y_Win = {320, 320, 370, 370};
            g.drawPolygon(X_Win,Y_Win,4);

            g.drawLine(270,345,330,345);
            g.drawLine(300,370,300,320);

            int[] X_Door = {170, 220, 220, 170};
            int[] Y_Door = {350, 350, 450, 450};
            g.drawPolygon(X_Door, Y_Door, 4);

            g.drawOval(210,400,5,5);

            //
            Color roofColor = new Color(62, 145, 181);
            g.setColor(roofColor);
            g.fillPolygon(X_Tri, Y_Tri,3);
        }

    } // end of inner


    // main
    public static void main(String[] args) {
        new MyHouse2();
    }

}
