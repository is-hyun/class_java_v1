package starcraft.ver_5;

public interface Starcraft {

    void attck(Unit unit);         // 공격 규칙
    void beAttacked(int power);    // 피격 규칙
    void showInfo();

}
