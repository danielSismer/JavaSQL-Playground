package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://caboose.proxy.rlwy.net:46138/railway";
    private static final String user = "root";
    private static final String senha = "LquMIJLIPMEfykNHNNTlxkpfRbsarOQF";

    public static Connection conectar () throws SQLException{
        return DriverManager.getConnection(url,user,senha);

    }
}
