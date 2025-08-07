package code.insert.order.main;

import code.insert.order.service.OrderDAO;
import code.insert.order.view.OrderView;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String [] args ){

        OrderDAO orderDAO = new OrderDAO();
        OrderView orderView = new OrderView();

        String clientName = orderView.insertNameCLient();
        String date = orderView.insertDate();
        double total = orderView.insertTotal();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater = LocalDate.parse(date, formatter);
        Date dateSQL = Date.valueOf(dateFormater);

        orderDAO.insertOrder(clientName, dateSQL, total);
    }
}
