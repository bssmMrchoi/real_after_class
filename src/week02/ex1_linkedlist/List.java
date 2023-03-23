package week02.ex1_linkedlist;

public interface List {
    Node add(String data);
    void printAll();
    Node remove(int position);
    Node insert(int position, String data);
    Node getElement(int position);
    void removeAll();
    int getSize();
    boolean isEmpty();
}
