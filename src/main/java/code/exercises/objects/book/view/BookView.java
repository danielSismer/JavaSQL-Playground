package code.exercises.objects.book.view;

import java.util.Scanner;

public class BookView {

    Scanner input = new Scanner(System.in);

    public String insertTitle(){
        System.out.print("Enter the book's title: ");
        return input.nextLine();
    }

    public String insertAuthor (){
        System.out.print("Enter the book's author: ");
        return input.nextLine();
    }

    public int insertYearOfPublication(){
        System.out.print("Enter the book's year of publication: ");
        return input.nextInt();
    }
}
