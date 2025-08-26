package code.exercises.objects.employee.view;

import java.util.Scanner;

public class EmployeeView {

    Scanner input = new Scanner(System.in);

    public String insertName(){
        System.out.print("Enter the employee's name: ");
        return input.nextLine();
    }

    public String insertPosition (){
        System.out.print("Enter the employee's position: ");
        return input.nextLine();
    }

    public double insertSalary(){
        System.out.print("Enter the employee's salary: ");
        return input.nextDouble();
    }
}
