package _test;

// 공통 데이터 검증 클래스
public class UserValidator {

    // 결과 코드 상수 정의
    public static final int SUCCESS = 0; // 성공
    public static final int INVALID_LENGTH = 1; // 길이 미달
    public static final int INVALID_FORMAT = 2; // 형식 불일치
    public static final int NULL_OR_EMPTY = 3; // 입력값 문제

    // 검증 기준 //
    // 최소 입력 길이
    private static final int MIN_ID_LENGTH = 5;
    private static final int MIN_PW_LENGTH = 8;

    // 입력 형식
    private static final String ID_FORMAT = "^[A-z0-9]]";
    private static final String PW_FORMAT = "";

    // ID 검증
    // 기준 = 5자 이상. 영소문자와 숫자만 허용
    public static int validatedId(String userId) {
        // 1. NULL / 빈 값 검증
        if (userId == null || userId.trim().isEmpty()) {
            return NULL_OR_EMPTY;
        }

        // 2. 길이 검증
        if (userId.length() < MIN_ID_LENGTH) {
            return INVALID_LENGTH;
        }

        // 3. 형식 검증
        for (char ch : userId.toCharArray()) {
            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                return INVALID_FORMAT;
            }
        }

        // 4. 성공
        return SUCCESS;
    }

    // PW 검증
    // 기준 = 8자 이상. 영문자, 숫자, 특수문자가 각각 최소 1개 이상 포함
    public static int validatePassword(String userPassword) {
        // 1. NULL / 빈 값 검증
        if (userPassword == null || userPassword.trim().isEmpty()) {
            return NULL_OR_EMPTY;
        }

        // 2. 길이 검증
        if (userPassword.length() < MIN_PW_LENGTH) {
            return INVALID_LENGTH;
        }

        // 3. 형식 검증
        boolean hasAlphabet = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char ch : userPassword.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                hasAlphabet = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else if ((ch >= 'ㄱ' && ch <= 'ㅎ') || (ch >= 'ㅏ' && ch <= 'l') || (ch >= '가' && ch <= '힣')) {
                // 한글 거르기
            } else if (ch == ' ') {
                // 공백 거르기
            } else {
                hasSpecial = true;
            }
        }
        if (!hasAlphabet || !hasDigit || !hasSpecial) {
            return INVALID_FORMAT;
        }

        // 4. 성공
        return SUCCESS;
    }

    // main에서 테스트
    public static void main(String[] args) {
        String testId = "user123";
        String testPw = "password1234!";

        int idResult = UserValidator.validatedId(testId);
        System.out.println("아이디 검증 결과 코드 : " + idResult);
        if (idResult == UserValidator.SUCCESS) {
            System.out.println(">> 사용할 수 있는 아이디입니다");
        } else if (idResult == UserValidator.INVALID_LENGTH) {
            System.out.println(">> 아이디는 최소 5자 이상이어야 합니다");
        } else if (idResult == UserValidator.INVALID_FORMAT) {
            System.out.println(">> 아이디에는 영소문자와 숫자만 사용할 수 있습니다");
        } else if (idResult == UserValidator.NULL_OR_EMPTY) {
            System.out.println(">> 아이디를 입력해 주세요");
        }

        System.out.println("==========");

        int pwResult = UserValidator.validatePassword(testPw);
        System.out.println("비밀번호 검증 결과 코드 : " + pwResult);
        if (pwResult == UserValidator.SUCCESS) {
            System.out.println(">> 사용할 수 있는 비밀번호입니다");
        } else if (pwResult == UserValidator.INVALID_LENGTH) {
            System.out.println(">> 비밀번호는 최소 8자 이상이어야 합니다");
        } else if (pwResult == UserValidator.INVALID_FORMAT) {
            System.out.println(">> 비밀번호에는 영문자, 숫자, 특수문자가 하나 이상 포함되어야 합니다");
        } else if (pwResult == UserValidator.NULL_OR_EMPTY) {
            System.out.println(">> 비밀번호를 입력해 주세요");
        }
    }
}
