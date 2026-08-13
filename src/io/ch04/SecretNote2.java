package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- 비밀 메모장 ----");
        System.out.println("1. 메모 작성");
        System.out.println("2. 메모 해석하기");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            saveRecord(sc);
        } else if (choice.equals("2")) {
            printRecord();
        } else if (choice.equals("3")) {
            // printOriginal();
        }

        sc.close();
    }


    // 해독해서 출력하는 기능
        public static void printRecord() {

        try (FileInputStream fis = new FileInputStream("C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\secret.txt")) {

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) (data - 3));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void saveRecord(Scanner sc) {
        System.out.print("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();
        byte[] original = input.getBytes();
        byte[] change = new byte[original.length];

        try (FileOutputStream secret = new FileOutputStream("C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\secret.txt")) {

            for (int i = 0; i < original.length; i++) {
                change[i] = (byte)(original[i] + 3);
            }

            secret.write(change);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
