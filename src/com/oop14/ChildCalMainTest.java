package com.oop14;

public class ChildCalMainTest {
    public static void main(String[] args) {

        ChildCal childCal = new ChildCal();

        System.out.println(childCal.sum(10, 10));
        System.out.println(childCal.multi(10, 0));
        System.out.println(childCal.sub(100, 1));

        // 코드 수정
        // 곱하기 메서드에 0이 입력되면 안내 문구 "0을 입력하지 마세요" 출력

    }
}
