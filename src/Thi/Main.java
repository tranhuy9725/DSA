package Thi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BaiDoXe baiDoXe = new BaiDoXe();
        boolean flag = true;
        while (flag) {
            System.out.println("1. Xe vào bãi");
            System.out.println("2. Xe rời bãi");
            System.out.println("3. Xem danh sách xe trong bãi");
            System.out.println("4. Xem danh sách xe đã rời");
            System.out.println("5. Thoát");
            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    System.out.println("Nhập biển số xe: ");
                    String bienSoXe = input.nextLine();
                    System.out.println("Nhập tên xe: ");
                    String tenXe = input.nextLine();
                    System.out.println("Nhập màu xe: ");
                    String mauXe = input.nextLine();
                    Oto oto = new Oto(bienSoXe, tenXe, mauXe);
                    baiDoXe.xeVaoBai(oto);
                    break;
                case 2:
                    baiDoXe.xeRaBai();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Danh sách xe trong bãi");
                    baiDoXe.xeDangTrongBai();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Danh sách xe đã rời");
                    baiDoXe.xeDaRaBai();
                    System.out.println();
                    break;
                case 5:
                    flag = false;
                    break;

                    default:
                        break;
            }
        }
    }
}