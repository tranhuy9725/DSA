package Queue.Bai5;

public class Order {
    private int orderId;
    private String customerName;
    private String drinkName;

    public Order(int orderId, String customerName, String drinkName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer='" + customerName + "', drink='" + drinkName + "'}";
    }
}
