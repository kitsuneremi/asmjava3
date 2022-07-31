
package asm.repo;
import java.sql.*;
public class DBConnector {
    public static Connection connection() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=asm;encrypt=true;trustServerCertificate=true","abc","123456");
        return conn;
    }
}
