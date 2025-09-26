package day2.BaiTap;


public class Node {
    Clothes data;
    Node prev;
    Node next;

    public Node(Clothes data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
