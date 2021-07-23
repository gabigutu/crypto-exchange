import java.sql.*;
import java.util.Properties;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;
    private static Connection connection;

    private DatabaseConnection() {
        this.init();
    }

    private void init() {

        String databaseURL = "jdbc:mysql://127.0.0.1:3306/cryptoexchange";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
       // properties.setProperty("password", "HARCEAPARCEA123");
        properties.setProperty("password", System.getenv("CRYPTO_PASSWORD"));
        try {
            this.connection = DriverManager.getConnection(databaseURL, properties);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public static Connection getConnection() {
        return connection;
    }
}
