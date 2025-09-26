
import day2.Head;
import day2.PhanTu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Head head = new Head();
//        head.addPhanTu(new PhanTu(1,2.3));
//        head.addPhanTu(new PhanTu(2,3.4));

        int s = 0;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            head.addPhanTu(new PhanTu(x,i));
        }
        head.display();
        double tong = head.tinhTong();
        System.out.println("Tong S = " + tong);
    }
}