package day2;

public class Head {
    Node head;

    public Head() {
        this.head = null;
    }

    public void addPhanTu(PhanTu phanTu) {
        Node newNode = new Node(phanTu);
        if(head == null) {
            head = newNode;
        }else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display(){
        Node currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }

    public double tinhTong() {
        double sum = 0;
        Node currentNode = head;
        while (currentNode != null) {
            sum += currentNode.data.getValue(); // cộng x^i
            currentNode = currentNode.next;
        }
        return sum;
    }
}
