package io.ch07;

import java.io.*;

public class FileCopy3 {

    public static void main(String[] args) {

        String sourceFilePath = "assets/employees.zip";
        String destinationFilePath = "assets/employees_copy.zip";
        long startTime = System.nanoTime();

        try (FileOutputStream fos = new FileOutputStream(destinationFilePath);
             FileInputStream fis = new FileInputStream(sourceFilePath);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            byte[] buffer = new byte[1024];
            int data;
            while ((data = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, data);
            }
            System.out.println("파일 복사 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.printf("소요 시간 : %.2f초 (%dns)", duration / 1_000_000_000.0, duration);


    } // end of main
}
