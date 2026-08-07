package starcraft.ver_5;

public class starTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("마린");
        Zealot z1 = new Zealot("질럿");
        Zergling zg1 = new Zergling("저글링");

        z1.attck(m1);
        while (m1.getHp() > 0) {
            z1.attck(m1);
        }
        z1.attck(m1);


    }
}
