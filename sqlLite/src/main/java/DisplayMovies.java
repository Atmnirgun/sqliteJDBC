import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayMovies {
    public void display() throws SQLException {
        String jdbcUrl = "jdbc:sqlite:movies.db";
        Connection connection = DriverManager.getConnection(jdbcUrl);
        String sql = "select * from details";

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()){
            String name = result.getString("name");
            String actor = result.getString("actor");
            String actress = result.getString("actress");
            String director = result.getString("director");
            int year = result.getInt("year");
            System.out.println(name + " | "+actor + " | " +actress+" | "+director+" | "+year);
        }
    }
}
