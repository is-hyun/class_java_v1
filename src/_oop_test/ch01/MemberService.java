package _oop_test.ch01;

public class MemberService {

    private MemberDAO memberDAO = new MemberDAO();

    public void registerMember(String id, String name) {
        Member member = new Member(id, name);
        memberDAO.insert(member);
    }
}
