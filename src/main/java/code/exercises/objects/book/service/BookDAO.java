package code.exercises.objects.book.service;

import code.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    public void insertBook(String title, String author, int publicationYear) {

        String SQLQuery = "INSERT INTO livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(SQLQuery)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setInt(3, publicationYear);
            stmt.executeUpdate();
            System.out.println("Book inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
