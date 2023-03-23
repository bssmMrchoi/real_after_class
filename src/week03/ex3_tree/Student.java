package week03.ex3_tree;

public class Student {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void showInfo() {
        System.out.println(number+" "+name);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
