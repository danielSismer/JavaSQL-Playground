package code.insert.student.view;

import java.util.Scanner;

public class StudentViewer {

    Scanner input = new Scanner(System.in);

    public String insertName(){
        System.out.print("Enter the student's name: ");
        return input.nextLine();
    }

    public String insertRegistration(){
        System.out.print("Enter the student's registration: ");
        return input.nextLine();
    }

    public String insertCourse(){
        System.out.print("Enter the student's course: ");
        return input.nextLine();
    }
}
