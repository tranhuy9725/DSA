package Queue.Bai1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCustomer {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.add("An");
        customerQueue.add("Bình");
        customerQueue.add("Chi");
        System.out.println("Danh sách khách hàng hiện tại: " + customerQueue);

        String servedCustomer = customerQueue.poll();
        System.out.println("Phục vụ khách hàng: " + servedCustomer);

        System.out.println("Sau khi phục vụ, hàng đợi còn: " + customerQueue);

        if (customerQueue.isEmpty()) {
            System.out.println("Hàng đợi hiện đang rỗng.");
        } else {
            System.out.println("Hàng đợi vẫn còn khách hàng.");
        }
    }
}
