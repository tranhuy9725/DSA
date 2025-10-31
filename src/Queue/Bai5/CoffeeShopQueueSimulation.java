package Queue.Bai5;

public class CoffeeShopQueueSimulation {
    public static void main(String[] args) {
        CoffeeShopQueue coffeeShop = new CoffeeShopQueue();

        coffeeShop.addOrder(new Order(1, "An", "Cà phê sữa"));
        coffeeShop.addOrder(new Order(2, "Bình", "Trà đào"));
        coffeeShop.addOrder(new Order(3, "Chi", "Latte"));

        coffeeShop.showOrders();

        coffeeShop.serveOrder();

        coffeeShop.showOrders();

        System.out.println("Số lượng order đang chờ: " + coffeeShop.countOrders());
    }
}
