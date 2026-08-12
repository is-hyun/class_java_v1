package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest3_1 {
    public static void main(String[] args) {

        LocalTime byteStart = LocalTime.now();

        try (FileInputStream in = new FileInputStream("assets/b.txt")) {

            int readData;
            while ((readData = in.read()) != -1) {
                // System.out.print((char) readData);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        LocalTime byteEnd = LocalTime.now();
        Duration byteTime = Duration.between(byteStart, byteEnd);

        LocalTime bufferStart = LocalTime.now();

        byte[] buffer = new byte[10];
        int readCount;
        try (FileInputStream in = new FileInputStream("assets/b.txt")) {
            while ((readCount = in.read(buffer)) != -1) {
                for (int i = 0; i < readCount; i++) {
                    // System.out.print((char) buffer[i]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        LocalTime bufferEnd = LocalTime.now();
        Duration bufferTime = Duration.between(bufferStart, bufferEnd);

        System.out.println("1byte씩 읽는 시간  : " + byteTime.toNanos() + "ns");
        System.out.println("byte[]로 읽는 시간 : " + bufferTime.toNanos() + "ns");

    }
}
