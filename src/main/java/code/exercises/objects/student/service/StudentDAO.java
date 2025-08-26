package code.exercises.objects.student.service;

import code.Conexao;
import code.exercises.objects.student.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // insert
    public static void insertStudent(String name, String registration, String course){
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

    // delete
    public static void deleteStudent(String matricula){
        String SQLQuery = "DELETE FROM alunos WHERE matricula = ?";
        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(SQLQuery)){
            stmt.setString(1, matricula);
            stmt.executeUpdate();
            System.out.println("Aluno removido com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    // update
    public static void updateByName(String novoNome, String matricula){
        String SQLQuery = "UPDATE alunos SET nome = ? WHERE matricula = ?";
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(SQLQuery)){
            stmt.setString(1, novoNome);
            stmt.setString(2, matricula);
            stmt.executeUpdate();
            System.out.println("Nome atualizado com sucesso");
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public static void updateByCourse( String novoCurso, String matricula){
        String SQLQuery = "UPDATE alunos SET curso = ? WHERE matricula = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(SQLQuery)){
            stmt.setString(1, novoCurso);
            stmt.setString(2, matricula);
            stmt.executeUpdate();
            System.out.println("Curso atualizado com sucesso");
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }


    // select
    public static Student selectStudent(String matricula){
        Student student = null;
        String SQlQuery = "SELECT * FROM alunos WHERE matricula = ?";
        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(SQlQuery)){

            stmt.setString(1, matricula);

            try(ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    student = new Student();
                    student.setNome(rs.getString("nome"));
                    student.setMatricula(rs.getString("matricula"));
                    student.setCurso(rs.getString("curso"));
                } else {
                    System.err.println("Mátricula não encontrada!");
                }
            }
        } catch (SQLException e ){
            e.printStackTrace();
        }
        return student;
    }


    public static List<Student> listAllStudents() {
        List<Student> students = new ArrayList<>();
        String SQLQuery = "SELECT * FROM alunos";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(SQLQuery);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();
                student.setNome(rs.getString("nome"));
                student.setMatricula(rs.getString("matricula"));
                student.setCurso(rs.getString("curso"));


                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
