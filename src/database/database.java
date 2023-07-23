
package database;

import java.sql.*;

public class database {
    private static final String URL = "jdbc:derby://localhost:1527/database";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public static database database;
    
    
    public static database getInstance() throws SQLException {
        if (database==null) {
            database = new database();
            connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            statement = connection.createStatement();
        }
        return database;
    }
    
    public int update(String query) throws SQLException {
        return statement.executeUpdate(query);
    }
    
    public ResultSet getRecords(String query) throws SQLException {
        resultSet = statement.executeQuery(query);
        return resultSet;
    }
}
