package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/MYSQLTESTE";
    private static final String user = "root";
    private static final String senha = "mysqlPW";

    public static Connection conectar () throws SQLException{
        return DriverManager.getConnection(url,user,senha);

    }
}
