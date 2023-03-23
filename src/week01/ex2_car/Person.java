package week01.ex2_car;

public class Person {
    private String name;
    private int money;
    private boolean transfer;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        this.transfer = false;
    }

    public void take(Take take) {
        if (take instanceof Subway) {
            Subway subway = (Subway) take;
            if (this.money < 1300) {
                System.out.println("잔돈이 부족합니다.");
                return;
            }
            subway.take(1300);
            this.money -= 1300;
            this.transfer = true;
        } else if (take instanceof Bus) {
            Bus bus = (Bus) take;
            if (transfer) {
                bus.take(200);
                this.money -= 200;
            }
        }
    }

    public void takeSubway(Subway subway) {
        if (this.money < 1300) {
            System.out.println("잔돈이 부족합니다.");
            return;
        }
        subway.take(1300);
        this.money -= 1300;
        this.transfer = true;
    }

    public void takeBus(Bus bus) {
        if (transfer) {
            bus.take(200);
            this.money -= 200;
        }
    }

    public void takeCar(Car car, int km) {
        if (car.getLiter() != 0) {
            car.take(km);
        } else {
            System.out.println("기름이 부족합니다.");
        }
    }

    public void oiling(Car car, GasStation suyeong, int liter) {
        money -= suyeong.oiling(car, liter);
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
