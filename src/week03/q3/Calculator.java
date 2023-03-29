package week03.q3;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int val) {
        this.value += val;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isOdd(int value) {
        return value % 2 == 0;
    }
}


