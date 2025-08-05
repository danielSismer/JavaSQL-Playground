package code.insert.order.service;

import code.Conexao;
import code.insert.product.service.ProductDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class OrderDAO {

    public void insertOrder(String client, String date, double total){

        String SQLQuery = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?, ?,?)";

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(SQLQuery)){
            stmt.setString(1, client);
            stmt.setString(2, date);
            stmt.setDouble(3, total);
            stmt.executeUpdate();
            System.out.println("Order successfully inserted!!!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
