package code.insert.product.view;

import java.util.Scanner;

public class ProductViewer {

    Scanner input = new Scanner(System.in);

    public String insertName() {
        System.out.print("Enter the product's name: ");
        return input.nextLine();
    }

    public Double insertPrice(){
        System.out.print("Enter the Product's price: ");
        return input.nextDouble();
    }

    public int insertAmount(){
        System.out.print("Enter the Product's amount: ");
        return input.nextInt();
    }
}
