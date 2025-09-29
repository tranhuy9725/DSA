package day3.bai3;

public class ProductList {
    private Node head;
    private Node tail;

    public ProductList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addFirst(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtPosition(int position, Product product) {
        if (position < 0) {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }
        Node newNode = new Node(product);
        if (position == 0) {
            addFirst(product);
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Vị trí vượt quá kích thước danh sách.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            addLast(product);
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void printForward() {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printBackward() {
        if (tail == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public Product findById(String id) {
        Node current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public Product findByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.data.getName().equalsIgnoreCase(name)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Vị trí không hợp lệ hoặc danh sách rỗng.");
            return;
        }
        if (position == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < position; i++) {
            if (current == null) {
                System.out.println("Vị trí vượt quá kích thước danh sách.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current == tail) {
            removeLast();
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public void removeById(String id) {
        Node current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                if (current == head) {
                    removeFirst();
                } else if (current == tail) {
                    removeLast();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
    }

    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void updateById(String id, String newName, double newPrice, int newQuantity) {
        Product product = findById(id);
        if (product != null) {
            product.setName(newName);
            product.setPrice(newPrice);
            product.setQuantity(newQuantity);
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với id: " + id);
        }
    }

    public Product findMaxPrice() {
        if (head == null) return null;
        Node current = head;
        Product max = head.data;
        while (current != null) {
            if (current.data.getPrice() > max.getPrice()) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public Product findMinPrice() {
        if (head == null) return null;
        Node current = head;
        Product min = head.data;
        while (current != null) {
            if (current.data.getPrice() < min.getPrice()) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public void sortByPriceAscending() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data.getPrice() > current.next.data.getPrice()) {
                    Product temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public double calculateTotalInventoryValue() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.getPrice() * current.data.getQuantity();
            current = current.next;
        }
        return total;
    }
}
