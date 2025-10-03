package day7.Stack.Bai1;

public class LinkedStack {
    private Node top;

    public LinkedStack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack rỗng, không thể pop");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            System.out.print(value);
            return value;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack rổng, không có gì để xem");
            return -1;
        } else {
            System.out.println(top.data);
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
