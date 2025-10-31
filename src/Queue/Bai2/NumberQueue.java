package Queue.Bai2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        System.out.println("Queue: "+queue);

        System.out.println("First Element: " + queue.peek());
        int last = 0;
        for (int i : queue) {
            last = i;
        }
        System.out.println("Last Element: " + last);
    }
}
