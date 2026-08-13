package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord2 {
    public static void main(String[] args) {

        // 키보드에서 값을 입력 받아 정의한 파일에 저장시키는 기능
        Scanner sc = new Scanner(System.in);

        System.out.println("======== 타자 연습 기록기 ========");
        System.out.println("1. 문장 저장");
        System.out.println("2. 기록 보기");
        String choice = sc.nextLine();

        if (choice.equals("1")){
            saveRecord(sc);
        } else if (choice.equals("2")) {
            printRecord();
        }

        sc.close();
    } // main

    public static void printRecord() {

        System.out.println("\n저장된 기록");
        try (FileInputStream fis = new FileInputStream("C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\typing.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void saveRecord(Scanner sc) {
        System.out.print("연습할 문장을 입력하세요 : ");
        LocalTime typeStart = LocalTime.now();
        String input = sc.nextLine();
        LocalTime typeEnd = LocalTime.now();

        Duration time1 = Duration.between(typeStart, typeEnd);
        long ms = time1.toMillis();
        double sec = ms / 1000.0;

        String record = input + "| 입력 소요시간 : " + sec + "초";

        try (FileOutputStream type = new FileOutputStream("assets/typing.txt", true)) {

            type.write(record.getBytes());
            type.write("\n".getBytes());
//            type.write();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
