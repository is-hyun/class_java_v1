package io.ch05;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardConsoleStream {
    public static void main(String[] args) {

        // 표준 스트림 >> InputStream -> (System.in)

        // 표준 스트림 + InputStreamReader(문자 기반)
        try (InputStreamReader isr = new InputStreamReader(System.in)) {

            // System.out.println();
            PrintWriter writer = new PrintWriter(System.out, true);

            System.out.println("텍스트를 입력하세요 ");

            int charCode;
            // Ctrl + D로 종료
            while ((charCode = isr.read()) != -1) {
                writer.print((char) charCode);
                writer.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
