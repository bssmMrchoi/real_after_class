package week03.ex1_queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue listQueue = new MyQueue();

        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");
        listQueue.enQueue("D");
        listQueue.enQueue("E");
        listQueue.printAll();

        System.out.println(listQueue.deQueue()+" 삭제");
        listQueue.printAll();

        System.out.println(listQueue.getElement(0).getData());
    }
}
