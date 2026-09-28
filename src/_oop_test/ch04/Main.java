package _oop_test.ch04;

public class Main {
    public static void main(String[] args) {
        MemberService ms = new MemberService();
        ms.registerMember("user01", "홍길동");

        System.out.println();
        // 전체 회원 목록 확인
        ms.printAllMembers();
    }
}
