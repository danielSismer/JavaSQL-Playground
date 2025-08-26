package code.exercises.objects.student.view;

import java.util.Scanner;

public class StudentViewer {

    static Scanner input = new Scanner(System.in);

    public static String insertName(){
        System.out.print("Enter the student's name: ");
        return input.nextLine();
    }

    public static String insertRegistration(){
        System.out.print("Enter the student's registration: ");
        return input.nextLine();
    }

    public static String insertCourse(){
        System.out.print("Enter the student's course: ");
        return input.nextLine();
    }

    public static String setarNovoCurso(){
        System.out.print("Insira o Novo Curso: ");
        return input.nextLine();
    }

    public static int updateChoose(){
        System.out.println("|=================================|");
        System.out.println("|            Atualizar            |");
        System.out.println("|=================================|");
        System.out.println("| 1 - Nome                        |");
        System.out.println("| 2 - Curso                       |");
        System.out.println("|=================================|");
        System.out.print("Insira a sua escolha: ");
        return input.nextInt();
    }
}
