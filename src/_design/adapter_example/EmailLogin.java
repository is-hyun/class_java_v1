package _design.adapter_example;

public class EmailLogin implements ILoginExtra{

    public String email;

    public EmailLogin(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void logIn(String username, String mailType) {
        System.out.printf("[%s 이메일 로그인 성공]\n", mailType);
        System.out.printf("%s 님, 환영합니다!\n", username);
    }
}
