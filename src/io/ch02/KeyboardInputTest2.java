package io.ch02;

import java.io.IOException;

public class KeyboardInputTest2 {

    public static void main(String[] args) throws IOException {

        // in - 한 번에 여러 데이터를 받을 수 있는 기능을 구현
        System.out.print("알파벳 여러 개를 쓰고 enter를 누르세요 : ");

        int i;
        while ((i = System.in.read()) != '\n') {  // '\n' = 10 (ASCII)
            System.out.print((char) i + " ");
        }

    }
}
