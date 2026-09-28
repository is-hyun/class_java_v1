package _oop_test.ch04;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    // 추가
    private List<Member> store = new ArrayList<>();

    public void insert(Member member) {
        // 추가
        store.add(member);
        System.out.println("[" + member.getName() + "] 회원 정보가 DB에 저장되었습니다.");

    }

    // 추가
    public List<Member> findAll() {
        return store;
    }
}
