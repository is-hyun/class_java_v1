package _design.adapter_example;

import _design.adapter.ElectronicAdapter;

public class EmailLoginAdapter implements ILoginStandard{

    private ILoginExtra loginByEmail;
    private String username;

    public EmailLoginAdapter(ILoginExtra loginByEmail) {
        this.loginByEmail = loginByEmail;
    }

    public String getUsername() {
        return this.username;
    }

    @Override
    public void logIn(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("잘못된 이메일 형식입니다");
        }
        String[] emailPart = email.split("@|\\.");
        if (emailPart.length >= 3) {
            String username = emailPart[0];
            String mailType = emailPart[1].toUpperCase();
            this.username = username;
            loginByEmail.logIn(username, mailType);
        } else {
            System.out.println("도메인 분석 오류");
        }
    }
}