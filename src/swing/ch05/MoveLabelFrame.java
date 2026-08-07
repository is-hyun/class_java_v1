package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveLabelFrame extends JFrame {

    private JLabel label;
    private final int MOVE_STEP = 10;

    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("방향키로 별 움직이기");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        label = new JLabel("☆");
        label.setFont(new Font("맑은 고딕", Font.BOLD,30));
        // 좌표 기반 - 크기 / 위치
        label.setSize(50,50);
        label.setLocation(200,200);
    }

    private void setInitLayout() {
        setLayout(null);
        add(label);
        setVisible(true);
    }

    private void addEventListener() {
        // 라벨에 이벤트를 붙이면 작동하지 않음
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int currentX = label.getX();
                int currentY = label.getY();
                label.setText("☆");

                if (e.getKeyCode() == 37) {
                    currentX -= MOVE_STEP;
                } else if (e.getKeyCode() == 38) {
                    currentY -= MOVE_STEP;
                } else if (e.getKeyCode() == 39) {
                    currentX += MOVE_STEP;
                } else if (e.getKeyCode() == 40) {
                    currentY += MOVE_STEP;
                }

                label.setLocation(currentX, currentY);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("★");
            }
        });
    }

    public static void main(String[] args) {
        new MoveLabelFrame();
    }

}
