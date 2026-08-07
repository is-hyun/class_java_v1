package useful.ch11;

public class Main1 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Father father = new Father(bankAccount);
        father.start();

        Mother mother = new Mother(bankAccount); // 하나의 자원(bankAccount) 공유
        mother.start();

        // 기대값 : 105,000원
        // 실행 결과 : 110,000원 >> 의도하지 않은 동작
        // >> synchronized 메서드로 해결 (동기화 처리)

    }
}
