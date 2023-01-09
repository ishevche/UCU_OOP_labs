package decorator;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.NoSuchElementException;

public class DBConnection {
    private static DBConnection dbconnection;

    private final Connection connection;

    @SneakyThrows
    private DBConnection() {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }

    public static DBConnection getInstance() {
        if (dbconnection == null) {
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }

    @SneakyThrows
    public boolean hasDocument(String id) {
        Statement stmt = connection.createStatement();
        String query = String.format("select * from cache "
                + "where gcPath = '%s';", id.replace("'", "''"));
        boolean result = stmt.executeQuery(query).next();
        stmt.close();
        return result;
    }

    @SneakyThrows
    public String getDocument(String id) {
        Statement stmt = connection.createStatement();
        String query = String.format("select * from cache "
                + "where gcPath = '%s';", id.replace("'", "''"));
        ResultSet result = stmt.executeQuery(query);

        if (!result.next()) {
            stmt.close();
            throw new NoSuchElementException("There is no "
                    + "document with such id");
        }
        String data = result.getString("data");
        stmt.close();
        return data;
    }

    @SneakyThrows
    public void putDocument(String id, String data) {
        Statement stmt = connection.createStatement();
        String query = String.format("insert into cache (gcPath, data)"
                + " values ('%s', '%s');", id.replace("'", "''"),
                data.replace("'", "''"));
        stmt.executeUpdate(query);
        stmt.close();
    }
}