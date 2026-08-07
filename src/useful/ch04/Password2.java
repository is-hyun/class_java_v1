package useful.ch04;

public class Password2 {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다");
        } else if (password.length() < 4) {
            throw new PasswordException("비밀번호는 네 자리 이상입니다");
        }
        this.password = password;
    }

    // 1. 사용자 정의 예외 클래스
    // 2. message를 받아서 출력
    // 3. setPassword에 오류 안내 메세지를 직접 만들어 예외 클래스로 활용
    // 4. 예외 클래스 이름은 PasswordException

    public static void main(String[] args) {

        Password2 pw = new Password2();

        try {
            // pw.setPassword(null);
            // pw.setPassword("abcd");

            pw.setPassword("ad");
            System.out.println("비밀번호가 설정되었습니다");

        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}