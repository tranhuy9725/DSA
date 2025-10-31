package Queue.Bai3;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue {
    public static void main(String[] args) {
        Queue<Student> queue = new LinkedList<>();

        queue.add(new Student(1, "An", 3.2));
        queue.add(new Student(2, "Bình", 3.6));
        queue.add(new Student(3, "Chi", 3.9));

        System.out.println("Danh sách sinh viên trong hàng đợi:");
        for (Student s : queue) {
            System.out.println(s);
        }

        Student served = queue.poll();
        System.out.println("Phục vụ sinh viên: " + served);

        System.out.println("Danh sách sinh viên còn lại:");
        for (Student s : queue) {
            System.out.println(s);
        }
    }
}
