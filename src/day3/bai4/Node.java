package day3.bai4;

public class Node {
    Song data;
    Node prev;
    Node next;

    public Node(Song data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
