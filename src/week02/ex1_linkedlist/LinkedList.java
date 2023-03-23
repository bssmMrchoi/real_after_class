package week02.ex1_linkedlist;

public class LinkedList implements List{
    private Node head;
    private int count;

    //끝에 추가
    @Override
    public Node add(String data) {
        Node newNode = new Node(data);;
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    //해당 위치에 추가
    @Override
    public Node insert(int position, String data) {
        Node tempNode = head;
        Node newNode = new Node(data);

        if(position < 0 || position > count) {
            System.out.println("추가 할 위치 오류입니다. 현재 리스트 개수는 "+ count + "개 입니다.");
            return null;
        }

        if(position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node preNode = null;
            for(int i=0; i<position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    //위치 노드 삭제
    @Override
    public Node remove(int position) {
        Node tempNode = head;

        if(position < 0 || position > count) {
            System.out.println("삭제할 위치 오류입니다. 현재 리스트 개수는" + count + "개 입니다.");
            return null;
        }
        if(position == 0) {
            head = tempNode.next;
        }
        else {
            Node preNode = null;
            for(int i=0; i<position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    @Override
    public Node getElement(int position) {
        Node tempNode = head;

        if(position < 0 || position > count ) {
            System.out.println("검색할 위치 오류입니다. 현재 리스트 개수는" + count + "개 입니다.");
            return null;
        }
        if(position == 0) {
            return head;
        }

        for(int i=0; i<position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    @Override
    public void removeAll() {
        head = null;
        count = 0;
    }

    @Override
    public int getSize()
    {
        return count;
    }

    @Override
    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    @Override
    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }
}
