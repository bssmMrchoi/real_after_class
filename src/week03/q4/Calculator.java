package week03.q4;

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


    public int avg(int[] dataArr) {
        int result=0;
        for (int data : dataArr) {
            result += data;
        }
        return result / dataArr.length;
    }
}


