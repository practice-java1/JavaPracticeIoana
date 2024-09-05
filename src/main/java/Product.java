package main.java;

public class Product {

    private String name123 = "Laptop Lenovo XP123";
    protected String nameABC = "Laptop Dell XPABC";
    String nameEFG = "Laptop EFG"; // default - access inside the package
    public String name89 = "Laptop 89";

    // final - CONSTANT, the value cannot be changed
    private final String ERROR_MESSAGE_FOR_INVALID_LOGIN = "The credentials are invalid!";

    public static void main(String[] args) {
        // attributes / properties / fields
        // data types for variables
        // code, name, description, price, quantity

        //non-primitive data
        String code = "ABC123";
        String name = "Fier de calcat";
        String description = "Philips";

        // non-primitive -> accepts NULL values
        // Double price = 500.30;
        // Integer quantity = 11;

        /// primitive
        int price1 = 115;
        int quantity1 = 11;

        int price2 = 265;
        int quantity2 = 5;

        // default values
        double price4; // default - 0.00
        int price5; // default - 0
        boolean stock; // default - false
        float price3; // default - 0.00f
        String name1; // default - null

        int total1 = price1 * quantity1;
        System.out.println("The total is " + total1);

        System.out.println("The total from the method is " + totalPriceForProductsInStock(price1, quantity1));
        System.out.println("The total from the method is " + totalPriceForProductsInStock(price2, quantity2));

        System.out.println("main.java.Product details: " + productDetails(name, description, price1));
    }

    // modificatori de acces - private, protected, default, public
    // tip de metode. 1. void / 2. non-void - methods with return type

    public static int totalPriceForProductsInStock(int productPrice, int productQuantity) {
        return productPrice * productQuantity;
    }

    public static String productDetails (String productName, String productDescription, double productPrice) {
        return productName + ", " + productDescription + ", " + productPrice;
        // + for String - concatenate
    }
}
