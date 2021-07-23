import java.lang.reflect.Field;
import java.sql.*;

@ActiveRecordEntity(tableName = "exchange_rates", keyColumnName = "id")
public class ExchangeRate extends ActiveRecord{
    public int id;
    public int from;
    public int to;
    public double exchange_rate;

    public ExchangeRate() {
    }

    public ExchangeRate(int id, int from, int to, double exchange_rate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchange_rate = exchange_rate;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", exchange_rate=" + exchange_rate +
                '}';
    }
}