package day7.Stack.Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UseStack4 editor = new UseStack4();

        while (true) {
            editor.show();
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Insert");
            System.out.println("2. Delete last character");
            System.out.println("3. Replace");
            System.out.println("4. Undo");
            System.out.println("5. Redo");
            System.out.println("6. Thoát");
            System.out.print("=> ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập chuỗi để thêm: ");
                    String str = sc.nextLine();
                    editor.insert(str);
                    break;
                case 2:
                    editor.deleteLast();
                    break;
                case 3:
                    System.out.print("Nhập chuỗi thay thế: ");
                    String rep = sc.nextLine();
                    editor.replace(rep);
                    break;
                case 4:
                    editor.undo();
                    break;
                case 5:
                    editor.redo();
                    break;
                case 6:
                    System.out.println("Kết thúc!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
