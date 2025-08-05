package code.insert.product.main;

import code.insert.product.service.ProductDAO;
import code.insert.product.view.ProductViewer;

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
