package code.exercises.objects.order.view;

import java.util.Scanner;

public class OrderView {

    Scanner input = new Scanner(System.in);

    public String insertNameCLient(){
        System.out.print("Enter the client's name: ");
        return input.nextLine();
    }

    public String insertDate (){
        System.out.print("Enter the order's date: ");
        return input.nextLine();
    }

    public double insertTotal(){
        System.out.print("Enter the order's total: ");
        return input.nextDouble();
    }
}
