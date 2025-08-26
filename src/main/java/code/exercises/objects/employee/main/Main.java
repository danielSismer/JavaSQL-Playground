package code.exercises.objects.employee.main;

import code.exercises.objects.employee.service.EmployeeDAO;
import code.exercises.objects.employee.view.EmployeeView;

public class Main {

    public static void main (String[] args ){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        EmployeeView employeeView = new EmployeeView();

        String employeeName = employeeView.insertName();
        String employeePosition = employeeView.insertPosition();
        double employedSalary = employeeView.insertSalary();

        employeeDAO.insertEmployee(employeeName, employeePosition, employedSalary);
    }


}
