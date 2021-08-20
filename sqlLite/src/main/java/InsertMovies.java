import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMovies {
    public void insertIntoTable() throws SQLException {
        String jdbcUrl = "jdbc:sqlite:movies.db";
        Connection connection = DriverManager.getConnection(jdbcUrl);
        String sql = "insert into details values ('ganges of wassepur','Nawaj','huma qureshi','anurag','2018')";

        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        if (rows > 0)
            System.out.println("row inserted");
    }
}
