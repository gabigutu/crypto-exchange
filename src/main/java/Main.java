import java.sql.SQLException;
import java.util.List;
import java.util.TreeMap;

import spark.Spark;

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

        // exchange/ltc/bth?amount=200
        Spark.get("/exchange/:from/:to", (req, res) -> {
            int from = Integer.parseInt(req.params("from"));
            int to = Integer.parseInt(req.params("to"));
            double amount = Double.parseDouble(req.queryParams("amount"));

            ExchangeRate exchangeRate = new ExchangeRate();
            exchangeRate.getRate(from, to);
            double sum = exchangeRate.exchange_rate * amount;
            Transaction transaction = new Transaction(0,amount, from, to, sum);
            return transaction.insert();
        });
    }


}
