package _design.adapter_example;

public class Login {

    // 표준 로그인
    public static void login(ILoginStandard account, String input){
        account.logIn(input);
    }

    // Main
    public static void main(String[] args) {

        // 1. 일반 로그인
        AccountLogin accountLogin = new AccountLogin("useridtest");
        login(accountLogin, accountLogin.getUserid());

        // 2. 이메일 로그인
        EmailLogin emailLogin = new EmailLogin("emailtest@naver.com");
        // login(emailLogin, emailLogin.getEmail());
        EmailLoginAdapter adapter = new EmailLoginAdapter(emailLogin);
        login(adapter, emailLogin.getEmail());

    }
}
