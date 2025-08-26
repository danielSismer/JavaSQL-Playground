package code.exercises.objects.employee.service;

import code.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    public EmployeeDAO(){

    }

    public void insertEmployee(String nome, String cargo, double salario){
        String SQLQuery = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(SQLQuery)){
            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setDouble(3, salario);
            stmt.executeUpdate();
            System.out.println("Employed inserted with sucess");
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }
}
