package code.exercises.objects.book.main;

import code.exercises.objects.book.service.BookDAO;
import code.exercises.objects.book.view.BookView;

public class Main {

    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        BookView bookView = new BookView();

        String title = bookView.insertTitle();
        String author = bookView.insertAuthor();
        int dataPublication = bookView.insertYearOfPublication();

        bookDAO.insertBook(title, author, dataPublication);

    }
}