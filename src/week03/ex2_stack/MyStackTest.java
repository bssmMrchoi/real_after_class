package week03.ex2_stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack listStack = new MyStack();

        listStack.push("A");
        listStack.push("B");
        listStack.push("C");
        listStack.printAll();

        System.out.println(listStack.pop()+" 삭제");
        listStack.printAll();

        System.out.println(listStack.getElement(0).getData());
    }
}
