package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame2 extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private final int MOVE_PLAYER = 15;

    public MyFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 -> 컴포넌트 크기와 위치 지정
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        ImageIcon playerIcon = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIcon);
        player.setSize(100,100);
        player.setLocation(450,500);
    }

    private void setInitLayout() {
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            int X = player.getX();
            int Y = player.getY();
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (X > -10) {
                        X -= MOVE_PLAYER;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (Y > -20) {
                        Y -= MOVE_PLAYER;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (X < 900) {
                        X += MOVE_PLAYER;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (Y < 510) {
                        Y += MOVE_PLAYER;
                    }
                }

                player.setLocation(X, Y);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MyFrame2();
    }

}
