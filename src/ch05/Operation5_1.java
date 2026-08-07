package ch05;

public class Operation5_1 {
    public static void main(String[] args) {

        int playerHealth = 50;
        int playerLevel = 10;
        int enemyHealth = 30;
        int enemyLevel = 15;

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인하는 코드를 작성하고 출력
        System.out.println(playerHealth > enemyHealth );

        // 2. 플레이어 체력이 위험 수준인 20이하인지 확인
        System.out.println(playerHealth <= 20);

        // 3. 플레이어와 적의 체력이 같은지 확인
        System.out.println(playerHealth == enemyHealth);

        // 4. 플레이어의 특정 레벨이 30 이상인지 확인
        System.out.println(playerLevel >= 30);

        // 5. 플레이어의 체력이 30 미만인지 확인
        System.out.println(playerHealth < 30);

        // 6. 플레이어의 체력이 50 초과인지 확인
        System.out.println(playerHealth > 50);

    }
}
