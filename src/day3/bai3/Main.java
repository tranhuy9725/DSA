package day3.bai3;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        productList.addFirst(new Product("P01", "Laptop", 1500.0, 10));
        productList.addFirst(new Product("P02", "Smartphone", 800.0, 20));
        productList.addFirst(new Product("P03", "Tablet", 600.0, 15));
        productList.addLast(new Product("P04", "Headphones", 200.0, 50));
        productList.addAtPosition(2, new Product("P05", "Mouse", 50.0, 100));

        System.out.println("Danh sách sản phẩm (từ đầu đến cuối):");
        productList.printForward();
        System.out.println();

        System.out.println("Tìm kiếm sản phẩm với id P03:");
        Product p1 = productList.findById("P03");
        System.out.println(p1 != null ? p1 : "Không tìm thấy");
        System.out.println();

        System.out.println("Tìm kiếm sản phẩm với tên Mouse:");
        Product p2 = productList.findByName("Mouse");
        System.out.println(p2 != null ? p2 : "Không tìm thấy");
        System.out.println();

        System.out.println("Sản phẩm có giá cao nhất:");
        Product max = productList.findMaxPrice();
        System.out.println(max != null ? max : "Danh sách rỗng");
        System.out.println();

        System.out.println("Sản phẩm có giá thấp nhất:");
        Product min = productList.findMinPrice();
        System.out.println(min != null ? min : "Danh sách rỗng");
        System.out.println();

        System.out.println("Danh sách sau khi xóa sản phẩm ở đầu:");
        productList.removeFirst();
        productList.printForward();
        System.out.println();

        System.out.println("Danh sách sau khi xóa sản phẩm ở cuối:");
        productList.removeLast();
        productList.printForward();
        System.out.println();

        System.out.println("Danh sách sau khi xóa sản phẩm với id P02:");
        productList.removeById("P02");
        productList.printForward();
        System.out.println();

        System.out.println("Số sản phẩm trong danh sách: " + productList.count());
        System.out.println();

        System.out.println("Danh sách sau khi sắp xếp theo giá tăng dần:");
        productList.sortByPriceAscending();
        productList.printForward();
        System.out.println();

        System.out.println("Tổng giá trị tồn kho: " + productList.calculateTotalInventoryValue());
    }
}