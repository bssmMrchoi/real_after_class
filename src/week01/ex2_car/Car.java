package week01.ex2_car;

public class Car implements Take{
    private String name;
    private int liter;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void take(int km) {
        this.liter -= km/15;
    }

    @Override
    public void showInfo() {
        System.out.println(name+"의 남은 기름은 "+liter+"L 입니다.");
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter += liter;
    }
}
