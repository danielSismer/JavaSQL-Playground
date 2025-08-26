package code.exercises.objects.product.main;

import code.exercises.objects.product.service.ProductDAO;
import code.exercises.objects.product.view.ProductViewer;

public class Main {

    public static void main (String [] args ){

        ProductDAO productDAO = new ProductDAO();
        ProductViewer productViewer = new ProductViewer();

        String name = productViewer.insertName();
        double price = productViewer.insertPrice();
        int amount = productViewer.insertAmount();

        productDAO.insertProduct(name, price, amount);

    }
}
