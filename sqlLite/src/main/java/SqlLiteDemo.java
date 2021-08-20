import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlLiteDemo {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:sqlite:movies.db";
        Connection connection = DriverManager.getConnection(jdbcUrl);
        //String sql = "create table details (name varchar(20),actor varchar(20),actress vaarchar(20),director varchar(20),year Integer)";

        //Statement statement = connection.createStatement();
        //statement.executeUpdate(sql);     //table created hence commented out

        //System.out.println("table created");

        InsertMovies s = new InsertMovies();
        s.insertIntoTable();
        DisplayMovies d = new DisplayMovies();
        d.display();
    }
}
