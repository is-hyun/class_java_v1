package starcraft.ver_1;

public class Marine {

    private String name;
    private int power;
    private int hp;

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
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

    // 1. 질럿을 공격
    public void attackZealot(Zealot zealot) {
        if (zealot.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        zealot.beAttacked(this.power);
    }

    // 2. 저글링을 공격
    public void attackMar(Zergling zergling) {
        if (zergling.getHp() <= 0) {
            System.out.println("이미 사망하여서 공격할 수 없습니다.");
            return;
        }
        zergling.beAttacked(this.power);
    }

    // 3. 공격 받는 코드
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

    // 4. 현재 상태 확인
    public void showInfo() {
        System.out.println("-------상태창-------");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
    }

}
