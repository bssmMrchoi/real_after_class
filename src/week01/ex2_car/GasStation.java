package week01.ex2_car;

public class GasStation {
    private String address;
    private int gasAccount;
    int money;

    public GasStation(String address) {
        this.address = address;
        this.gasAccount = 10;
    }

    public int oiling(Car car, int liter) {
        this.gasAccount -= liter;
        car.setLiter(liter);
        this.money += 1600 * liter;
        return 1600 * liter;
    }

    public void showInfo() {
        System.out.println(address + "지점 주유소의 남은 기름은 " + gasAccount + "리터이고, 수입은 " + money + "원 입니다.");
    }
}
