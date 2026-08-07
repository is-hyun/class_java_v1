package com.oop6;

public class AccountTest {
    public static void main(String[] args) {

        Account ac = new Account();
        ac.deposit(10_000);
        ac.withdraw(6_000);
        ac.showInfo();

        // 접근 제어 지시자가 필요한 이유
        // 가상 시나리오
        // 나는 객체의 행동인 입금하는 기능을 만들었는데
        // 동료 개발자가 실수로 입금하는 기능이 아닌 직접 변수의 접근값ㅇ르 수정한다면
        // 의도하지 않은 결과를 발생시킬 수 있다.

//        ac.balance = 10_000; // 멤버 변수의 접근을 제한하니 변경 불가


        // 변수에 직접 접근해서 값ㅇ르 수정할 경우 실수할 가능성이 많다.
        // 그래서 우리는 변수에 private 사용해서 외부에서 필드 안보이게 설정하는 것이 좋다.

        System.out.println("--------------------");
        ac.showInfo();

    }
}