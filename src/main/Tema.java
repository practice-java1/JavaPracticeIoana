package main;

public class Tema {
    public static void main(String[] args) {

        Person person10 = new Person("Alina", 30, "Nicolina", 9, 18);
        // Receives 2 numbers (integer) and computes and returns their sum.
        // person10.getName()??

        int x = 300;
        int y = 250;

        //int sum = x + y;
        System.out.println("The sum of the numbers is " + sumOfTwoNumbers(x, y));


        // Receives 1 number (double) and returns the square of its value (number to power 2).

        double myNumber = 12.5;
        // double square = myNumber * myNumber;

        System.out.println("The square of myNumber value is " + squareValueOfTheNumber(myNumber));


        // Receives 2 string values, joins them and returns the result as a single string.
        String myFirstString = "Ana are";
        String mySecondString = " mere.";

        System.out.println("The result of join two string values : " + joinStrings(myFirstString, mySecondString));


        // Receives a string value, computes and returns its length (number of characters).
        String str = "smile";

        System.out.println("The length of the string is: " + stringLength(str));


        // Receives 3 values (x, min, max) and returns true if the first one is between the other 2 values (min <= x <= max), or false otherwise.
        int xx = 25;
        int min = 20;
        int max = 30;

        System.out.println("Is xx between min and max? " + "Answer: " + isBetween(xx, min, max));


        // Receives 2 string values, compares their length and returns a boolean result (true if they are equal, false otherwise)

        String first = "Maria";
        String second = "Adina";


        System.out.println("Are the lengths of the two strings equal? " + "Answer: " + compareLength(first, second));


        // Receives 3 boolean values, returns true if at least one of them is true.
        boolean isSunny = true;
        boolean isCloudy = false;
        boolean isWindy = true;


        System.out.println("Is at least one of the boolean values true? " + "Answer: " + booleanValues(isSunny, isCloudy, isWindy));


        // Receives 3 boolean values, returns true if all 3 are true.
        boolean a = true;
        boolean b = true;
        boolean c = true;

        System.out.println("All 3 boolean values are: " + "Answer: " + trueBooleanValues(a, b, c));


        //Receives 3 boolean values, returns true if none of them is true.
        boolean d = false;
        boolean e = false;
        boolean f = false;


        System.out.println("Are all boolean values false? " + "Answer: " + allFalse(d, e, f));


        //Receives 3 boolean values, returns true if exactly 2 of them are true.
        boolean g = true;
        boolean h = true;
        boolean i = false;

        System.out.println("Are exactly two of the boolean values true? " + "Answer: " + twoValuesTrue(g, h, i));

    }

    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

    public static double squareValueOfTheNumber(double myNumber) {
        return myNumber * myNumber;
    }

    public static String joinStrings(String myFirstString, String mySecondString) {
        return myFirstString + mySecondString;
    }

    public static int stringLength(String str) {
        return str.length();
    }

    public static boolean isBetween(int xx, int min, int max) {
        return min <= xx && xx <= max;
    }

    public static boolean compareLength(String first, String second) {
        return first.length() == second.length();
    }

    public static boolean booleanValues(boolean isSunny, boolean isCloudy, boolean isWindy) {
        //  return isSunny == true || isCloudy == true || isWindy == true; // nu face si asociere de valori
        return isSunny || isCloudy || isWindy;
    }

    public static boolean trueBooleanValues(boolean a, boolean b, boolean c) {
        return a && b  & c; // same
    }

    public static boolean allFalse(boolean d, boolean e, boolean f) {
        return d != true && e != true && f != true; // same
    }

    public static boolean twoValuesTrue(boolean g, boolean h, boolean i) {
        // return (a && b && !c) || (a && c && !b) || (b && c && !a);
        int count = 0;

        if (g == true) {
            count++;
        }
        if (h == true) {
            count++;
        }
        if (i == true) {
            count++;
        }
        return count == 2;
    }
}
