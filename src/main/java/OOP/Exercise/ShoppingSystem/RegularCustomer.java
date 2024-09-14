package main.java.OOP.Exercise.ShoppingSystem;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name, String city) {
        super(name, city);
    }

    @Override
    public double calculateDiscount(Order order) {
        return order.calculateTotalPrice();
    }
}
