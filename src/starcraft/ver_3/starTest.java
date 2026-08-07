package starcraft.ver_3;

public class starTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("마린");
        Zealot z1 = new Zealot("질럿");
        Zergling zg1 = new Zergling("저글링");


        z1.attack(zg1);
        for (int i = 0; i < 10; i++) {
            z1.attack(zg1);
        }
        z1.attack(zg1);

        zg1.showInfo();

        z1.beAttacked(m1.getPower());
        zg1.showInfo();

    }
}
