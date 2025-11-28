package p4;


public class LinkedStack {
    private Node top;

    public LinkedStack(){
        this.top = null;
    }

    public void push(String value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot be popped");
            return null;
        } else {
            String value = top.data;
            top = top.next;
            System.out.print(value);
            return value;
        }
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, nothing to see");
            return null;
        } else {
            System.out.println(top.data);
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear(){
        top = null;
    }
}
