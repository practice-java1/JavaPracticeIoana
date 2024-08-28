package main.AccommodationExercise;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import static main.AccommodationExercise.AccommodationRegistry.*;

public class Test {

    public static void main(String[] args) {

        final DecimalFormat df = new DecimalFormat("0.00");

        List<Accommodation> accommodations = Arrays.asList(new Accommodation(Category.HOTEL, 250.99, "Iasi"),
                new Accommodation(Category.STUDIO, 350.00, "Bucuresti"), new Accommodation(Category.PENSION, 190.45, "Suceava"),
                new Accommodation(Category.HOTEL, 500.00, "Cluj"));

        System.out.println("The nr. of categories for the accommodation list is: " + categoriesCount(accommodations));
        System.out.println("The accommodations are from the " + cityList(accommodations) + " cities.");
        System.out.println("The average price for the category " + Category.HOTEL + " is: " +
                df.format(averagePriceForOneCategory(accommodations, Category.HOTEL)) + " lei.");

        System.out.println("The average price for one category is: " + df.format(averagePriceForOneCategory(accommodations, Category.STUDIO)) + " lei.");

        System.out.println(accommodations);

    }
}
