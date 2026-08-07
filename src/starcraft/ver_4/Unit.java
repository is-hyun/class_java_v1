package starcraft.ver_4;

public class Unit {

    protected String name;
    protected int power;
    protected int hp;


    // getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }


    public void attck(Unit unit) {
        // 1. 자신이 사망한 상태
        if (this.hp <= 0) {
            System.out.println(name + "은(는) 사망하여 공격할 수 없습니다");
            return;
        }

        // 2. 공격
        System.out.println(name + "이(가) " + unit.getName() + "을 공격 합니다.");
        unit.beAttacked(this.power);
    }

    // 공격을 당했다.
    public void beAttacked(int power) {
        if (this.hp <= 0) { // 실제로 작동되지 않는 코드
            System.out.println(name + "이(가) 사망하여 공격할 수 없습니다");
            return;
        }
        this.hp -= power;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(name + "이(가) 공격을 당합니다. (남은 HP : " + this.hp + ")");
        if (this.hp == 0) {
            System.out.println("[!] " + name + "이(가) 사망했습니다.");
        }
    }

    // 상태창
    public void showInfo() {
        System.out.println("★----------상태창--------------★");
        System.out.println("유닛 이름 : " + name + " | 공격력 : " + power + " | 체력 : " + hp);
    }


}
