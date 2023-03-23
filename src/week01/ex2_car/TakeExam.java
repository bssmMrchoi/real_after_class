package week01.ex2_car;

public class TakeExam {
    public static void main(String[] args) {
        Person choi = new Person("choi", 5000);
        Subway brown = new Subway(3);
        Bus bus7_2 = new Bus("7-2");

//        choi.takeSubway(brown);
//        choi.takeBus(bus7_2);
        choi.take(brown);
        choi.take(bus7_2);

        choi.showInfo();
        brown.showInfo();
        bus7_2.showInfo();

        System.out.println("=======================");

        Person choi2 = new Person("choi2", 5000);
        Car car = new Car("myCar");
        GasStation suyeong = new GasStation("suyeong");

        choi2.oiling(car, suyeong, 3);
        choi2.takeCar(car, 30);

        choi2.showInfo();
        suyeong.showInfo();
        car.showInfo();
    }
}
