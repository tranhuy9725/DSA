package Queue.Bai5;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShopQueue {
    private Queue<Order> orderQueue = new LinkedList<>();

    public void addOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Đã thêm order: " + order);
    }

    public void serveOrder() {
        if (!orderQueue.isEmpty()) {
            Order served = orderQueue.poll();
            System.out.println("Đang phục vụ: " + served);
        } else {
            System.out.println("Không còn order nào để phục vụ!");
        }
    }

    public void showOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("Không có order nào đang chờ.");
        } else {
            System.out.println("Danh sách order đang chờ:");
            for (Order o : orderQueue) {
                System.out.println(o);
            }
        }
    }

    public int countOrders() {
        return orderQueue.size();
    }
}
