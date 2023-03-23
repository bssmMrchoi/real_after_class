package week01.ex1_static;

public class StaticExam {
    public static void main(String[] args) {
        Employee choi = new Employee();
        choi.setEmployeeName("choi");

        Employee kim = new Employee();
        kim.setEmployeeName("kim");

        System.out.println(choi.getEmployeeName() + "의 사번은 " + choi.getEmployeeId());
        System.out.println(kim.getEmployeeName() + "의 사번은 " + kim.getEmployeeId());
    }
}
