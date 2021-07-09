
package cdbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDb {
    public static Connection conectar() throws SQLException {
        try {
            // conexao
            Class.forName("com.mysql.jdbc.Driver");
            
            return DriverManager.getConnection("jdbc:mysql://localhost/db_user_data", "root", "marleide03");
            
        } catch (ClassNotFoundException e) {
            // erro
            throw new SQLException(e.getException());
        }
    }
}
