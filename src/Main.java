//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import day1.Product;
import day1.ProductList;

public class Main {
    public static void main(String[] args) {
        ProductList  list = new ProductList();
        list.addProduct(new Product(1,"Trần Đức Việt", 1, 1, "S88"));
        list.addProduct(new Product(2,"Nguyễn Vũ Trường An", 0.5, 1, "S88"));
        list.addProduct(new Product(1,"Trần Việt Đức", 1, 1, "S88"));
        list.addProduct(new Product(1,"Trần Việt", 1, 1, "S87"));
        list.addProduct(new Product(1,"Vịt Đực", 1, 1, "S87"));
        list.display();
//        list.searchBrand("S87");
    }
}