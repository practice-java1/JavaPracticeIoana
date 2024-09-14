package main.java.OOP.Exercise.ShoppingSystem;

public class Electronics extends Product {
    private boolean isWarrantyAvailable;

    public Electronics(String name, double price, String category, boolean isWarrantyAvailable) {
        super(name, price, category);
        this.isWarrantyAvailable = isWarrantyAvailable;
    }

    public boolean isWarrantyAvailable() {
        return isWarrantyAvailable;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.2; // discount 20%
    }
}
