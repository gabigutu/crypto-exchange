@ActiveRecordEntity(tableName = "accounts", keyColumnName = "id")
public class Account {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String password;

}
