package main.java.OOP.Exercise.ShoppingSystem;

public abstract class Customer {

    private String name;
    private String city;

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public abstract double calculateDiscount(Order order);
}
