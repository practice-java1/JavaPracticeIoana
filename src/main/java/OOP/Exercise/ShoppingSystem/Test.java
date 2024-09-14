package main.java.OOP.Exercise.ShoppingSystem;

public class Test {
    public static void main(String[] args) {

        Product laptop = new Electronics("laptop", 500.00, "electronics", true);

        Product dress = new Clothes("Rochie de seara", 450.20, "clothes", "S");


        Order order = new Order();
        order.addProductToCart(laptop);
        order.addProductToCart(dress);


        PremiumCustomer premiumCustomer = new PremiumCustomer("Dima Irina", "Iasi");
        RegularCustomer regularCustomer = new RegularCustomer("Sima Roxana", "Craiova");


        double totalPrice = order.calculateTotalPrice();
        System.out.println("Total price without discount " + totalPrice);


        System.out.println("Final price after applying 10% discount to the Clothes category: " + order.calculateTotalPriceForProduct(dress));
        System.out.println("Final price after applying 10% discount to the Electronics category: " + order.calculateTotalPriceForProduct(laptop));


        double finalPriceForPremium = premiumCustomer.calculateDiscount(order);
        System.out.println("Final price for Premiun Customer (Dima Irina): " + finalPriceForPremium);

        double finalPriceForRegular = regularCustomer.calculateDiscount(order);
        System.out.println("Final price for Regular Customer (Sima Roxana): " + finalPriceForRegular);


    }
}
