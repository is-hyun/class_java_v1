package starcraft.ver_1;

public class Zealot {

    private String name; // null
    private int power;   // 0
    private int hp;     // 0

    public Zealot(String name) {
        this.name = name;
        this.power = 5;
        this.hp = 80;
    }

    // get
    public String getName() {
        return name;
    }
    public int getPower() {
        return power;
    }
    public int getHp() {
        return hp;
    }

    // 1. 질럿이 저글링을 공격합니다.
    public void attackZerg(Zergling zergling) {
        if (zergling.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        zergling.beAttacked(this.power);
    }

    // 2. 질럿이 마린을 공격합니다.
    public void attackMar(Marine marine) {
        if (marine.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        marine.beAttacked(this.power);
    }

    // 3. 자기 자신(질럿)이 공격을 당합니다.
    public void beAttacked(int power) {
        // 방어적 코드
        if (this.hp <= 0) {
            System.out.println("이미 사망한 상태입니다.");
            return;
        }
        this.hp -= power;
        System.out.println(this.name + "이 공격을 당합니다.");
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println("!! " + this.name + "이 사망했습니다.");
        }
    }

    // 4. 내 현재 상태 출력(콘솔) 기능 만들기
    public void showInfo() {
        System.out.println("-------상태창-------");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
    }

}
