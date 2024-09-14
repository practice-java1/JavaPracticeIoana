package main.java.OOP.Exercise.ShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList = new ArrayList<>();

    public void addProductToCart(Product product) {
        productList.add(product);
    }

    public double calculateTotalPrice() {
        double finalPrice = 0.00;
        for (Product currentProduct : productList) {
            finalPrice += currentProduct.getPrice();
        }
        return finalPrice;
    }



    public double calculateTotalPriceForProduct(Product product) {
        double totalWithDiscount = 0.00;

        for (Product currentProduct : productList) {
            if (currentProduct.equals(product)) {
                totalWithDiscount += currentProduct.getDiscountedPrice();
            }
        }
        return totalWithDiscount;
    }

}

