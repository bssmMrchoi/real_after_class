package week03.ex2_stack;

import week02.ex1_linkedlist.LinkedList;
import week02.ex1_linkedlist.Node;

public class MyStack extends LinkedList implements IStack{
    Node top;

    @Override
    public void push(String data) {
        Node newNode = insert(0, data);
        if(isEmpty()) {
            top = newNode;
            return ;
        }
        top = newNode;
        System.out.println(newNode.getData() + " push");
    }

    @Override
    public String pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        String data = remove(0).getData();
        top = top.next;
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return ;
        }
        Node temp = top;
        System.out.println("=====");
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
        System.out.println("=====");
    }
}
