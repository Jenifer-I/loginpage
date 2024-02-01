import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
        private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
        private static final String USERNAME = "yourusername";
        private static final String PASSWORD = "yourpassword";

        public static void main(String[] args) {
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                System.out.println("Connected to the database!");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    System.out.println("ID: " + id + ", Name: " + name);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


