package week01.ex1_static.singleton;

public class SingletonExam {
    public static void main(String[] args) {
        //School busan = new School();
        School busan = School.getInstance();
        School meister = School.getInstance();

        System.out.println(busan);
        System.out.println(meister);
    }
}
