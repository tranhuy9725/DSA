package p4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            editor.show();
            System.out.println("\nSelect action:");
            System.out.println("1. Insert");
            System.out.println("2. Delete last character");
            System.out.println("3. Replace");
            System.out.println("4. Undo");
            System.out.println("5. Redo");
            System.out.println("6. Exit");
            System.out.print("=> ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string to add:");
                    String str = sc.nextLine();
                    editor.insert(str);
                    break;
                case 2:
                    editor.deleteLast();
                    break;
                case 3:
                    System.out.print("Enter the replacement string:");
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
                    System.out.println("End!");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
