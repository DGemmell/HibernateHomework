import db.DBHelper;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Customer customer1 = new Customer("linda mcGinlay");
        DBHelper.save(customer1);

        Customer customer2 = new Customer("Liz Douglas");
        DBHelper.save(customer2);

        Order order1 = new Order("Blue Dress",123,1, 50.00, customer1);
        DBHelper.save(order1);

        Order order2 = new Order("Red Dress",124, 1, 60.00, customer2);
        DBHelper.save(order2);

        order1.setPrice(10.00);
        DBHelper.save(order1);

        List<Order> orders = DBHelper.getAll("Order");
        List<Customer> customers = DBHelper.getAll("Customer");


    }
}
