package code.insert.product.service;

import code.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {

    public void insertProduct(String name, double price, int amount){
        String SQLquery = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(SQLquery)){
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, amount);
            stmt.executeUpdate();
            System.out.println("Product successfully inserted!!!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
