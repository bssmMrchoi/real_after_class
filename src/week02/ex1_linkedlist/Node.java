package week02.ex1_linkedlist;

public class Node {
    private String data;
    public Node next;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }
}
