package week03.q2;

import week03.q1.Calculator;

public class MaxLimitCalculator extends Calculator {
    @Override
    public void add(int val) {
        if (getValue() + val > 100) {
            setValue(100);
        } else {
            setValue(getValue() + val);
        }
    }
}
