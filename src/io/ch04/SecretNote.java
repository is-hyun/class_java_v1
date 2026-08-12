package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- 비밀 메모장 ----");
        System.out.print("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();

        byte[] original = input.getBytes();
        byte[] change = new byte[original.length];

        FileOutputStream secret = null;
        try {
            secret = new FileOutputStream("assets/secret.txt");

            for (int i = 0; i < original.length; i++) {
                change[i] = (byte)(original[i] + 3);
            }

            secret.write(change);
            secret.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (secret != null) {
                try {
                    secret.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        sc.close();
    }
}
