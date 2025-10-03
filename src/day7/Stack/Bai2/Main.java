package day7.Stack.Bai2;

import day7.Stack.Bai1.LinkedStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thập phân: ");
        int decimal = sc.nextInt();

        int n = decimal;
        if (n == 0) {
            System.out.println("Số nhị phân: 0");
            return;
        }

        LinkedStack linkedStack = new LinkedStack();

        while (n > 0) {
            int remainder = n % 2;
            linkedStack.push(remainder);
            n = n / 2;
        }

        System.out.print("Số nhị phân: ");
        while (!linkedStack.isEmpty()) {
            linkedStack.pop();
        }
    }
}
