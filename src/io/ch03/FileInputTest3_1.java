package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputTest3 {
    public static void main(String[] args) {

        // in.read(byte[] b)를 사용해서 코드를 완성하세요
        // 데이터를 담을 byte 배열 선언
        // 크기 10 = 한 번에 최대 10바이트까지 읽어오기
        byte[] buffer = new byte[10];

        // read(byte[])는 읽은 바이트 수(int)를 반환
        // read()가 바이트 값 자체를 반환하는 것과는 다름
        int readCount;

        try (FileInputStream in = new FileInputStream("assets/a.txt")) {

            while ((readCount = in.read(buffer)) != -1) {
                // for (int i = 0; i < buffer.length; i++) {
                    // >> buffer 배열의 크기는 항상 10으로 고정되어 있어서
                    // >> 읽은 바이트 수가 10보다 작은 경우에 임의로 추가 문자를 붙여서 출력하는 문제가 생김
                for (int i = 0; i < readCount; i++) { // 읽은 개수만큼만 출력
                    System.out.print((char) buffer[i]);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // close() 자동 호출

    }
}
