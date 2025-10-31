package Queue.Bai6;

public class BankServiceSimulation {
    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();

        bankQueue.addCustomer(new Customer(1, "An", "deposit", 5000));
        bankQueue.addCustomer(new Customer(2, "Bình", "withdraw", 2000));
        bankQueue.addCustomer(new Customer(3, "Chi", "deposit", 3000));

        bankQueue.showWaitingList();

        bankQueue.serveCustomer();

        bankQueue.showWaitingList();

        System.out.println("Tổng số tiền đang chờ giao dịch: " + bankQueue.totalPendingAmount());
    }
}
