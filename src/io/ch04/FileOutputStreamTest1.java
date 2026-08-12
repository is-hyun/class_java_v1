package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {

        String data = "Hello, Java FileOutputStream ...";

        // new FileOutputStream("assets/c.txt");
        // // 기존 파일 데이터에 덮어쓰지 말고 추가하게 함
        // new FileOutputStream("assets/c.txt", true);

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("assets/c.txt", true);
            fos.write(97);
            fos.write(98);
            fos.write(99);

            fos.write(data.getBytes());

            fos.flush();
            // 단, fos.close() 메서드를 호출하면 자동으로 flush -> close 순으로 실행된다

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
