package main.AccommodationExercise;

import java.util.*;

public class AccommodationRegistry {

    static int categoriesCount(List<Accommodation> accommodationList) {
        Set<Category> categories = new HashSet<>();
        for (Accommodation value : accommodationList) {
            categories.add(value.getCategory());
        }
        return categories.size();
    }

    static Collection<String> cityList(List<Accommodation> accommodationList) {
        Set<String> cityNames = new TreeSet<>();
        for (Accommodation currentCity : accommodationList) {
            cityNames.add(currentCity.getCity());
        }
        return cityNames;
    }

    static double averagePriceForOneCategory(List<Accommodation> accommodationList, Category categories) {
        int count = 0;
        double sum = 0.0;
        for (Accommodation b : accommodationList) {
            if (b.getCategory() == categories) {
                count++;
                sum += b.getPrice();
            }
        }
        return sum / count;
    }

    /*
        public boolean isOlderThan(Person other) {
        return this.birthYear < other.birthYear;
    }

        public Set<String> uniqueNames() {
        Set<String> names = new TreeSet<>();
        for (Person p : persons.values()) {
            names.add(p.getName());
        }
        return names;
    }

        public double averageAge() {
        if (persons.isEmpty()) return 0;
        int sum = 0;
        for (Person p : persons.values()) {
            sum += p.getAge();
        }
        return (double) sum / persons.size();
    }

     */
}
