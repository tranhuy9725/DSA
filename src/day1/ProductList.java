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

    public void addFirst(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfter(int id, Product  product) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if(currentNode.data.getId() == id) {
                Node newNode = new Node(product);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("Null");
        }else if(head.next == null){
            head = null;
        }else{
            Node currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }
}
