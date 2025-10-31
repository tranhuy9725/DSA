package Queue.Bai6;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Customer> customerQueue = new LinkedList<>();

    public void addCustomer(Customer c) {
        customerQueue.add(c);
        System.out.println("Đã thêm khách hàng: " + c);
    }

    public void serveCustomer() {
        if (!customerQueue.isEmpty()) {
            Customer served = customerQueue.poll();
            System.out.println("Đang phục vụ khách hàng: " + served);
        } else {
            System.out.println("Không còn khách hàng nào trong hàng chờ!");
        }
    }

    public void showWaitingList() {
        if (customerQueue.isEmpty()) {
            System.out.println("Không có khách hàng nào đang chờ giao dịch.");
        } else {
            System.out.println("Danh sách khách hàng đang chờ:");
            for (Customer c : customerQueue) {
                System.out.println(c);
            }
        }
    }

    public double totalPendingAmount() {
        double total = 0;
        for (Customer c : customerQueue) {
            total += c.getAmount();
        }
        return total;
    }
}
