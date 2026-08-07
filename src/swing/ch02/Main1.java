package swing.ch02;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {

        MyComponent mc = new MyComponent();
        mc.run();

        JTextField field1 = mc.getTextField();
        field1.setText("홍길동");

    }
}
