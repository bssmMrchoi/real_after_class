package week02.ex1_linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.printAll();
        list.insert(1, "D");
        list.printAll();
        list.remove(0);
        list.printAll();

        System.out.println(list.getElement(2).getData());
        System.out.println(list.getSize());

        list.add("A");
        list.printAll();

        list.removeAll();
        list.printAll();
    }
}
