package day3.bai2;

public class Main {
    public static void main(String[] args) {
        StudentList  studentList = new StudentList();
        studentList.addFirst(new Student("A00","A",15,4.1));
        studentList.addFirst(new Student("B00","B",15,4.5));
        studentList.addFirst(new Student("C00","C",15,3.5));
        studentList.addLast(new Student("D00","D",15,9.5));
        studentList.addAfter("B00", new Student("E00","E",15,4.5));
        studentList.display();
        System.out.println();
        studentList.searchById("C00");
        System.out.println();
        studentList.searchByName("E");
        System.out.println();
        studentList.searchGpaMax();
        System.out.println();
        studentList.searchGpaMin();
        System.out.println();
        studentList.removeFist();
        studentList.display();
        System.out.println();
        studentList.removeLast();
        studentList.display();
        System.out.println();
        studentList.removeById("B00");
        studentList.display();
        studentList.countStudentList();
        System.out.println();
        studentList.sortByGpaDesc();
    }
}
