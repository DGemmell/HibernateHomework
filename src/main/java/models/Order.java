package models;

public class Order {

    private int id;
    private String item_name;
    private int item_number;
    private int quantity;
    private double price;
    private Customer customer;

    public Order() {
    }

    public Order(String item_name, int item_number, int quantity, double price, Customer customer) {
        this.item_name = item_name;
        this.item_number = item_number;
        this.quantity = quantity;
        this.price = price;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_number() {
        return item_number;
    }

    public void setItem_number(int item_number) {
        this.item_number = item_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
