package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    // 랜덤 로또 번호 6개 static 메서드
    public static int[] makeNum() {
        Random random = new Random();

        // int g1 = random.nextInt(45) +1;
        // >> 반복문 사용
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(45) + 1;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] lotto = makeNum();
        // System.out.println(lotto); // 주소값

        // System.out.println(lotto[0]);
        // >> 반복문 사용
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + "\t");
        }

    }
}
