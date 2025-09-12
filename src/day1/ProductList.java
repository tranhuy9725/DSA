package day1;

public class ProductList {
    Node head;

    public ProductList() {
        this.head = null;
    }

    public void addProduct(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        }else{
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }

    public void searchBrand(String brand) {
        Node currentNode = head;
        while (currentNode != null) {
            if(currentNode.data.getBrand().equals(brand)) {
                System.out.println(currentNode.data.toString());
            }
            currentNode = currentNode.next;
        }
    }
}
