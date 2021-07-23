import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        try {
          List<Account> accountList = account.getAll();
            System.out.println(accountList);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
