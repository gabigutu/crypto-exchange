@ActiveRecordEntity(tableName = "accounts", keyColumnName = "id")
public class Account extends ActiveRecord{
    public int id;
    public String first_name;
    public String last_name;
    public String email;
    public String password;

    public Account(){

    }
    public Account(int id, String first_name, String last_name, String email, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
