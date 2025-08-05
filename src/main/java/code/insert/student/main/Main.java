package code.insert.student.main;
import code.insert.student.service.StudentDAO;
import code.insert.student.view.StudentViewer;

import java.util.Scanner;
public class Main {

    public static void main(String [] args ){

        Scanner input = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        StudentViewer studentViewer = new StudentViewer();

        String name = studentViewer.insertName();
        String registration = studentViewer.insertRegistration();
        String course = studentViewer.insertCourse();

        studentDAO.insertStudent(name, registration, course);

    }
}
