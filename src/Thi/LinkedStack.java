package Thi;

public class LinkedStack {
    private Node top;

    public LinkedStack() {
        top = null;
    }

    public void push(Oto oto) {
        Node newNode = new Node(oto);
        if (top == null) {
            top = newNode;
        }else {
            newNode.next =  top;
            top = newNode;
        }
    }

    public Oto pop() {
        if(isEmpty()){
            System.out.println("Stack rỗng, không thể pop");
            return null;
        } else {
            Oto oto = top.data;
            top = top.next;
            return oto;
        }
    }
    public Oto peek() {
        if(isEmpty()){
            System.out.println("Stack rổng, không có gì để xem");
            return null;
        } else {
            return top.data;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void clear(){
        top = null;
    }

    public void printStack() {
        Node currentNode = top;
        while (currentNode != null) {
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }
}
