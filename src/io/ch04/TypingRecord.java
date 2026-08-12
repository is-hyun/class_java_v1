package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord {
    public static void main(String[] args) {

        // 1. 키보드에서 값을 입력 받아 정의한 파일에 저장시키는 기능
        Scanner sc = new Scanner(System.in);

        System.out.println("======== 타자 연습 기록기 ========");
        System.out.print("연습할 문장을 입력하세요 : ");
        LocalTime typeStart = LocalTime.now();
        String input = sc.nextLine();
        LocalTime typeEnd = LocalTime.now();

        Duration time1 = Duration.between(typeStart, typeEnd);
        long ms = time1.toMillis();
        double sec = ms / 1000.0;
        System.out.println("입력 소요시간 : " + sec + "초");

        LocalTime start = LocalTime.now();

        FileOutputStream type = null;
        try {
            type = new FileOutputStream("assets/typing.txt", true);

            type.write(input.getBytes());
            type.write("\n".getBytes());

            //type.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (type != null) {
                try {
                    type.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        LocalTime end = LocalTime.now();

        Duration time2 = Duration.between(start, end);
        System.out.println("처리 소요시간 : " + time2.toNanos() + "ns");

        sc.close();
    } // main
}
