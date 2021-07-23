@ActiveRecordEntity(tableName = "coins", keyColumnName = "id")
public class Coin extends ActiveRecord{
    public int id;
    public String name;
    public String short_name;

    public Coin(int id, String name, String short_name) {
        this.id = id;
        this.name = name;
        this.short_name = short_name;
    }
}
