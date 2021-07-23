@ActiveRecordEntity(tableName = "transactions", keyColumnName = "id")
public class Transaction extends ActiveRecord{
    public int id;
    public double amount;
    public int from;
    public int to;
    public double amount_received;

    public Transaction() {
    }

    public Transaction(int id, double amount, int from, int to, double amount_received) {
        this.id = id;
        this.amount = amount;
        this.from = from;
        this.to = to;
        this.amount_received = amount_received;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", from=" + from +
                ", to=" + to +
                ", amount_received=" + amount_received +
                '}';
    }
}
