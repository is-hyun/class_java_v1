package io.ch07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedKeyboard {
    public static void main(String[] args) {

        // 도전 과제 1 - 바이트 기반
        // 키보드에서 데이터를 보조 기반 스트림으로 받기
        // 콘솔에 출력

        System.out.println("내용을 입력하세요 (Ctrl + D로 출력)");
        try (BufferedInputStream bis = new BufferedInputStream(System.in);
             BufferedOutputStream bos = new BufferedOutputStream(System.out)) {

            byte[] buffer = new byte[1024];
            int byteRead;

            while ((byteRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, byteRead); // 읽은 만큼만 씀
            }

            // 1바이트씩
            // int data;
            // while ((data = bis.read()) != -1) {
            //    bos.write(data);
            // }
            // bos.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
