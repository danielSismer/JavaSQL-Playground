package code.insert.student.service;

import code.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public void insertStudent(String name, String registration, String course){
        String SQLquery = "INSERT INTO alunos (nome, matricula, curso) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = (conn.prepareStatement(SQLquery))){
            stmt.setString(1, name);
            stmt.setString(2, registration);
            stmt.setString(3,course);
            stmt.executeUpdate();
            System.out.println("Student successfully inserted!!!");
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }
}
