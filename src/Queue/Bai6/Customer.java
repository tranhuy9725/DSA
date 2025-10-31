package Queue.Bai6;

public class Customer {
    private int id;
    private String name;
    private String transactionType; // "withdraw" hoặc "deposit"
    private double amount;

    public Customer(int id, String name, String transactionType, double amount) {
        this.id = id;
        this.name = name;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', type='" + transactionType + "', amount=" + amount + "}";
    }
}
