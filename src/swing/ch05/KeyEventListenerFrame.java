package swing.ch05;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventListenerFrame extends JFrame {

    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame() {
        initData();
        setInitLayout();
        addEventListener();

        setVisible(true);
    }

    private void initData() {
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false); // 사용자 마우스로 프레임 크기 조절 불가

        textArea = new JTextArea();
    }

    private void setInitLayout() {
        add(textArea);
        setVisible(true);
    }

    private void addEventListener() {

        // 익명 내부 클래스로 KeyListener 인터페이스 구현
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // System.out.println("keyTyped 발생 : " + e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println("keyPressed 발생 : " + e.getKeyCode());
                if (e.getKeyCode() == 37) {
                    textArea.append("왼쪽 방향키 ← \n");
                } else if (e.getKeyCode() == 38) {
                    textArea.append("위쪽 방향키 ↑ \n");
                } else if (e.getKeyCode() == 39) {
                    textArea.append("오른쪽 방향키 → \n");
                } else if (e.getKeyCode() == 40) {
                    textArea.append("아래쪽 방향키 ↓ \n");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println("keyReleased 발생 : " + e.getKeyCode());
            }
        });

    }

    public static void main(String[] args) {
        new KeyEventListenerFrame();
    }
}
