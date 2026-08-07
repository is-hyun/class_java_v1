package starcraft.ver_1;

public class Zergling {

    private String name; // null
    private int power;   // 0
    private int hp;     // 0

    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
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

    // 1. 저글링이 질럿을 공격
    public void attackZealot(Zealot zealot) {
        if (zealot.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        zealot.beAttacked(this.power);
    }

    // 2. 저글링이 마린을 공격
    public void attackMar(Marine marine) {
        if (marine.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        marine.beAttacked(this.power);
    }

    // 3. 공격 당하는 메서드
    public void beAttacked(int power) {
        // 방어적 코드 (attack 함수 조건에 막혀서 실행되지는 않음)
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

    // 4. 현재 상태
    public void showInfo() {
        System.out.println("-------상태창-------");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
    }

}
