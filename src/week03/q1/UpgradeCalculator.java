package week03.q1;

public class UpgradeCalculator extends Calculator {

    public void minus(int i) {
        int result = getValue() - i;
        setValue(i);
    }
}
