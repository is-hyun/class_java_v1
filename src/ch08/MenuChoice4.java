package ch08;

import java.util.Scanner;

public class MenuChoice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 스캐너 활용 - 문자열로 값 받기
        int menuNumber = sc.nextInt();
        // nextInt는 정수값만 가져가고 개행문자는 남겨둔다 --> 개행문자가 name 변수에 저장
        // 개행문자를 소비해야 함
        sc.nextLine();
        String name = sc.nextLine(); // 문자열 받기

        System.out.println("menuNumber : " + menuNumber);
        System.out.println("name : " + name);

        sc.close();
    }
}

