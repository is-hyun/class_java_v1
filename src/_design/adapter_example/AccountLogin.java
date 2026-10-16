package _design.adapter_example;

// 표준 로그인 = 아이디 / 비밀번호 로그인
public class AccountLogin implements ILoginStandard {

    private String userid;

    // 생성자
    public AccountLogin(String userid) {
        this.userid = userid;
    }

    // getter
    public String getUserid() {
        return userid;
    }

    @Override
    public void logIn(String userid) {
        System.out.println("[계정 로그인 성공]");
        System.out.printf("%s 님, 환영합니다\n", userid);
    }
}
