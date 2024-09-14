package main.java.OOP.Exercise.ShoppingSystem;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name, String city) {
        super(name, city);
    }

    @Override
    public double calculateDiscount(Order order) {
        double totalPrice = order.calculateTotalPrice();
        double discount = totalPrice * 0.1;

        double finalPrice = totalPrice - discount;
        return finalPrice;
    }
}
