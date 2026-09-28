package _oop_test.ch04;

import java.util.List;

public class MemberService {

    private MemberDAO memberDAO = new MemberDAO();

    public void registerMember(String id, String name) {
        Member member = new Member(id, name);
        memberDAO.insert(member);
    }

    // 추가
    public void printAllMembers() {
        List<Member> members = memberDAO.findAll();
        System.out.println("=== 전체 회원 목록 ===");
        for (Member member : members) {
            System.out.println("ID : " + member.getId() + ", 이름 : " + member.getName());
        }
    }
}
