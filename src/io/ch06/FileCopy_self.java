package io.ch06;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;

public class FileCopy_self {

    public static void main(String[] args) {
        System.out.println("원본 파일을 읽어오는 중입니다...");
        LocalTime start = LocalTime.now();

        ReadFile();

        LocalTime end = LocalTime.now();
        System.out.println("\n파일 복사가 완료되었습니다!");
        Duration time = Duration.between(start, end);
        System.out.println("소요 시간 | " + time.toSeconds() + "초");
    }

    static byte[] bytes = new byte[100];

    // 원본 파일 읽기
    public static void ReadFile() {

        try (FileInputStream fis = new FileInputStream("C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\img1.zip")) {

            int data;
            while ((data = fis.read(bytes)) != -1) {
                CopyFile(bytes, data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 복사본 내보내기
    public static void CopyFile(byte[] b, int count) {

        try (FileOutputStream fos = new FileOutputStream("C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\img1_copy.zip", true)) {

            for (int i = 0; i < count; i++) {
                fos.write(bytes[i]);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
