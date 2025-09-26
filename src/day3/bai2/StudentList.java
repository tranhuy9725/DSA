package day3.bai2;

public class StudentList {
    Node head;

    public StudentList() {
        this.head = null;
    }

    public void addLast(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        }else{
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void addFirst(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfter(String id,  Student student) {
        Node currentNode = head;
        while (currentNode.next != null){
            if (currentNode.data.getId().equals(id)){
                Node newNode = new Node(student);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }

    public void searchById(String id){
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.data.getId().equals(id)){
                System.out.println(currentNode.data.toString());
            }
            currentNode = currentNode.next;
        }
    }

    public void searchByName(String name){
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.data.getName().equals(name)){
                System.out.println(currentNode.data.toString());
            }
            currentNode = currentNode.next;
        }
    }

    public void removeFist(){
        if(head == null){
            System.out.println("Null");
        } else if (head.next == null) {
            head = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(head == null){
            System.out.println("Null");
        }else if (head.next == null) {
            head = null;
        }else {
            Node currentNode = head;
            while (currentNode.next.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void removeById(String id){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data.getId().equals(id)) {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            return;
        }

        Node currentNode = head;
        Node prev = null;

        while (currentNode != null && !currentNode.data.getId().equals(id)) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            System.out.println("Student with id " + id + " not found!");
            return;
        }

        System.out.println("Deleted: " + currentNode.data);
        prev.next = currentNode.next;
    }

    public void countStudentList(){
        int count = 0;
        Node currentNode = head;
        while (currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        System.out.println("Count student list: "+count);
    }

    public void searchGpaMax(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currentNode = head;
        Node maxGpa = head;
        while (currentNode != null){
            if(currentNode.data.getGpa() > maxGpa.data.getGpa()){
                maxGpa = currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Max GPA student list: ");
        System.out.println(maxGpa.data.toString());
    }
    public void searchGpaMin(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currentNode = head;
        Node minGpa = head;
        while (currentNode.next != null){
            if(currentNode.data.getGpa() < minGpa.data.getGpa()){
                minGpa = currentNode;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Min GPA student list: ");
        System.out.println(minGpa.data.toString());
    }

    public void sortByGpaDesc() {
        if (head == null || head.next == null) {
            return;
        }

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (j.data.getGpa() > i.data.getGpa()) {
                    Student temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("Sorted student list by GPA (descending):");
        display();
    }

}
