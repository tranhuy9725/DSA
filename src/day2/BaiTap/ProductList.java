package day2.BaiTap;

import java.util.Scanner;

public class ProductList {
    Node head;
    Node tail;

    public ProductList() {
        head = null;
        tail = null;
    }

    public void addFirst(Clothes clothes){
        Node newNode = new Node(clothes);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Clothes clothes){
        Node newNode = new Node(clothes);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = head;
            head.prev = tail;
            tail = newNode;
        }
    }

    public void addAfterId(String id, Clothes clothes){
        if(head == null){
            System.out.println("Empty list.");
        }else{
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.data.getId().equals(id)){
                    Node newNode = new Node(clothes);
                    if(currentNode == tail){
                        currentNode.next = newNode;
                        newNode.prev = currentNode;
                        tail = newNode;
                    }else{
                        Node nextNode = currentNode.next;
                        currentNode.next = newNode;
                        newNode.prev = currentNode;
                        newNode.next = nextNode;
                        nextNode.prev = newNode;
                    }
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Empty List");
        }else if(head == tail){
            tail = head = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(tail == null){
            System.out.println("Empty List");
        } else if(tail == head){
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeById(String id){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.getId().equals(id)){
                    if(currentNode == head){
                        removeFirst();
                    } else if (currentNode == tail) {
                        removeLast();
                    } else {
                        Node prevNode = currentNode.prev;
                        Node nextNode = currentNode.next;
                        prevNode.next = nextNode;
                        nextNode.prev = prevNode;
                    }
                }
            }
        }
    }

    public void searchById(String id){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.getId().equals(id)){
                    System.out.println(currentNode.data.toString());
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void searchBySize(String size){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.getSize().equals(size)){
                    System.out.println(currentNode.data.toString());
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void printForward(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }

    public void printBackward(){
        Node currentNode = tail;
        while (currentNode != null){
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.prev;
        }
    }

    public void countProduct(){
        int count = 0;
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                count += currentNode.data.getQuantity();
                currentNode = currentNode.next;
            }
        }
        System.out.println("So luong san pham la: "+count);
    }

    public void countSumPrice(){
        double sum = 0;
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                sum += (currentNode.data.getQuantity() *  currentNode.data.getPrice());
                currentNode = currentNode.next;
            }
        }
        System.out.println("Tong tien la: " + sum);
    }

    public void updateQuantityById(String id, Scanner scanner){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.getId().equals(id)){
                    System.out.println(currentNode.data.toString());
                }
                currentNode = currentNode.next;
            }
            System.out.println("New quantity:");
            int quantity = scanner.nextInt();
            currentNode.data.setQuantity(quantity);
        }
    }
}
