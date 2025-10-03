package day7.Stack.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistory browser = new BrowserHistory("google.com");
        while (true) {
            System.out.println("\nTrang hiện tại: " + browser.getCurrentPage());
            System.out.println("Chọn thao tác:");
            System.out.println("1. Visit trang mới");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Thoát");
            System.out.print("=> ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập URL: ");
                    String url = sc.nextLine();
                    browser.visit(url);
                    break;
                case 2:
                    browser.back();
                    break;
                case 3:
                    browser.forward();
                    break;
                case 4:
                    System.out.println("Kết thúc!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
