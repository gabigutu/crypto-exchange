@ActiveRecordEntity(tableName = "exchange_rates", keyColumnName = "")
public class ExchangeRate extends ActiveRecord{
    public int from;
    public int to;
    public double exchange_rate;

    public ExchangeRate(int from, int to, double exchange_rate) {
        this.from = from;
        this.to = to;
        this.exchange_rate = exchange_rate;
    }
}
