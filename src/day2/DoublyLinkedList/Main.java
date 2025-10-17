package day2.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Thêm vào đầu danh sách
        list.addFirst(new Student("S01", "Nguyen Van A"));
        list.addFirst(new Student("S02", "Tran Thi B"));

        // Thêm vào cuối danh sách
        list.addLast(new Student("S03", "Le Van C"));
        list.addLast(new Student("S04", "Pham Thi D"));

        // In danh sách theo hai chiều
        list.printForward();
        System.out.println("----------------------");
        list.printBackward();
    }
}
