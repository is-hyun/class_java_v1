package swing.ch06;

import javax.swing.*;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    public MyFrame() {
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
        player.setLocation(450,510);
    }

    private void setInitLayout() {
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        setVisible(true);
    }

    private void addEventListener() {

    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
