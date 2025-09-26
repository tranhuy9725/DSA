package day2.BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        Scanner scanner = new Scanner(System.in);

        productList.addFirst(new Clothes("A01", "Trần Đức Việt", "S", 1.2, 2));
        productList.addFirst(new Clothes("A01", "Trần Việt Đức", "L", 1.3, 3));
        productList.addFirst(new Clothes("A01", "Việt Đức Trần", "M", 1.4, 4));
        productList.printBackward();
    }
}
