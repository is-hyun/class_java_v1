package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame4 extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private final int MOVE_PLAYER = 10;

    private JLabel enemy;
    private final int MOVE_ENEMY = 10;
    private final int MOVE_TIME = 80;

    // 플레이어 이미지 L / R
    ImageIcon playerIconL = new ImageIcon("images/playerL.png");
    ImageIcon playerIconR = new ImageIcon("images/playerR.png");

    // 몬스터 이미지 L / R
    ImageIcon enemyIconL = new ImageIcon("images/enemyL.png");
    ImageIcon enemyIconR = new ImageIcon("images/enemyR.png");

    public MyFrame4() {
        initData();
        setInitLayout();
        addEventListener();
        enemyMove();
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
        playerIconL = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIconL);
        player.setSize(100, 100);
        player.setLocation(450, 510); // 450 510

        // 몬스터 이미지 초기화
        enemyIconR = new ImageIcon("images/enemyR.png");
        enemy = new JLabel(enemyIconR);
        enemy.setSize(100,100);
        enemy.setLocation(50,510);
    }

    private void setInitLayout() {
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        backgroundMap.add(enemy);
        setVisible(true);
    }

    public void enemyMove() {
        int X = enemy.getX();
        int Y = enemy.getY();
        boolean moveR = true;
        boolean moveL = false;

        while (true) {
            while (moveR) {
                enemy.setIcon(enemyIconR);
                X += MOVE_ENEMY;
                enemy.setLocation(X,Y);

                try {
                    Thread.sleep(MOVE_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (X == 870) {
                    moveR = false;
                    moveL = true;
                }
            }
            while (moveL) {
                enemy.setIcon(enemyIconL);
                X -= MOVE_ENEMY;
                enemy.setLocation(X,Y);

                try {
                    Thread.sleep(MOVE_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (X == 50) {
                    moveL = false;
                    moveR = true;
                }
            }
        }
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
                int X = player.getX();
                int Y = player.getY();

                // 제어문 - swith
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.setIcon(playerIconL);
                        if (X > 40) {
                            if (Y <= 510 && Y >= 470) {
                                X -= MOVE_PLAYER;
                            } else if (Y <= 390 && Y >= 350) {
                                X -= MOVE_PLAYER;
                            } else if (Y <= 270 && Y >= 230) {
                                X -= MOVE_PLAYER;
                            } else if (Y <= 150 && Y >= 0) {
                                X -= MOVE_PLAYER;
                            } else if ((X > 100 && X <= 140) || (X > 760 && X <= 800)) {
                                X -= MOVE_PLAYER;
                            }
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (Y > 0) {
                            if (Y > 470) {
                                Y -= MOVE_PLAYER;
                            } else if (Y > 350 && Y <= 390) {
                                Y -= MOVE_PLAYER;
                            } else if (Y > 230 && Y <= 270) {
                                Y -= MOVE_PLAYER;
                            } else if (Y <= 150) {
                                Y -= MOVE_PLAYER;
                            } else if ((X >= 100 && X <= 140) || (X >= 760 && X <= 800)) {
                                Y -= MOVE_PLAYER;
                            }
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setIcon(playerIconR);
                        if (X < 870) {
                            if (Y <= 510 && Y >= 470) {
                                X += MOVE_PLAYER;
                            } else if (Y <= 390 && Y >= 350) {
                                X += MOVE_PLAYER;
                            } else if (Y <= 270 && Y >= 230) {
                                X += MOVE_PLAYER;
                            } else if (Y <= 150 && Y >= 0) {
                                X += MOVE_PLAYER;
                            } else if ((X >= 100 && X < 140) || (X >= 760 && X < 800)) {
                                X += MOVE_PLAYER;
                            }
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (Y < 510) {
                            if (Y >= 470) {
                                Y += MOVE_PLAYER;
                            } else if (Y >= 350 && Y < 390) {
                                Y += MOVE_PLAYER;
                            } else if (Y >= 230 && Y < 270) {
                                Y += MOVE_PLAYER;
                            } else if (Y < 150) {
                                Y += MOVE_PLAYER;
                            } else if ((X >= 100 && X <= 140) || (X >= 760 && X <= 800)) {
                                Y += MOVE_PLAYER;
                            }
                        }
                        break;
                    default:
                        return;
                }
                player.setLocation(X, Y);
                // System.out.println(player.getLocation()); 좌표 확인용
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MyFrame4();
    }

}