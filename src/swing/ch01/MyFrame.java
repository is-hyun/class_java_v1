package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public MyFrame() {
        super.setTitle("배치 관리자 연습");
        super.setSize(500, 500);
        super.setVisible(true);

        initData(); // 합성 관계
        setInitLayout();
    }

    public void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");  // 객체 초기화
        button3 = new JButton("button3");
    }

    public void setInitLayout() {
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();
        // 컴포넌트들을 수평 / 수직으로 프레임 배치
        super.setLayout(flowLayout);
        super.add(button1);  // 생성된 버튼 프레임 붙이기
        super.add(button2);
        super.add(button3);
    }

    // main 테스트
    public static void main(String[] args) {

        MyFrame frame1 = new MyFrame();


    }

}
