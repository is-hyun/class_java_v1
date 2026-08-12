package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class FileInputTest2 {
    public static void main(String[] args) {

        // 파일을 열면 반드시 닫아주는 것이 좋다
        // 하지만 반복적 코드가 매번 발생하는 불편함 존재
        //  >>> 새로운 문법 try-with-resources

//        try {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//
//        }

//        try(스트림을 생성 ... 자동으로 close() 호출 됨) {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try (FileInputStream in = new FileInputStream("assets/a.txt")) {

            int readData;
            while ((readData = in.read()) != -1) {
                System.out.print((char) readData);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // close() 자동 호출

    }
}
