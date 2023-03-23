package week01.ex2_car;

public class Bus implements Take{
    String number;
    int passengerCount;
    int money;

    public Bus(String number) {
        this.number = number;
    }

    @Override
    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    @Override
    public void showInfo() {
        System.out.println(number + "번 버스의 누적 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
