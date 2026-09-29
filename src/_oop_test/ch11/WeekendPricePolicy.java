package _oop_test.ch11;

public class WeekendPricePolicy implements PricePolicy{
    private int extraPercent = 10;

    @Override
    public int calculate(int price) {
        return price * (extraPercent + 100) / 100;
    }
}
