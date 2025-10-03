package day7.Stack.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập dãy số:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedStack linkedStack = new LinkedStack();
        for (int i = 0; i < arr.length; i++) {
            linkedStack.push(arr[i]);
        }

        System.out.println("Dãy số đảo ngược:");
        while (!linkedStack.isEmpty()) {
            linkedStack.pop();
        }
    }
}
