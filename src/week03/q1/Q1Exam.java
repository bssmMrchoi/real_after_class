package week03.q1;

public class Q1Exam {
    public static void main(String[] args) {
        Calculator cal =new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력

        UpgradeCalculator uCal =new UpgradeCalculator();
        uCal.add(10);
        uCal.minus(7);
        System.out.println(uCal.getValue());  // 10에서 7을 뺀 3을 출력

    }
}
