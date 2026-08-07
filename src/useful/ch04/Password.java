package useful.ch04;

public class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            System.out.println("비밀번호는 null일 수 없습니다");
        } else if (password.length() < 4) {
            System.out.println("비밀번호는 네 자리 이상입니다");
        }

        this.password = password;

    }

}