package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveLabelFrame2 extends JFrame {

    private JLabel label;
    private final int MOVE_STEP = 10;
    int count = 0;

    public MoveLabelFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
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

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    currentX -= MOVE_STEP;
                    count++;
                    setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    currentY -= MOVE_STEP;
                    count++;
                    setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    currentX += MOVE_STEP;
                    count++;
                    setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    currentY += MOVE_STEP;
                    count++;
                    setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
                }

                label.setLocation(currentX, currentY);

                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    label.setLocation(200,200);
                    count = 0;
                    setTitle("방향키로 별 움직이기 | 이동 횟수 : " + count);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("★");
            }
        });
    }

    public static void main(String[] args) {
        new MoveLabelFrame2();
    }

}
