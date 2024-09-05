package main.java;

import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] note = new int[4]; // declarare + setarea dimensiunii

        note[0] = 9;
        note[1] = 10;
        note[2] = 8;
        note[3] = 9;

        // descending array
        Integer[] arr = {10, 20, 5, 18, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));

        System.out.println("Dimensiune array = " + note.length);
        System.out.println("Ultima valoarea este = " + note[note.length - 1]); // note.lehgth-1 -> indexul, pozitia valorii

        // print val. 10
        System.out.println(note[1]);

        String[] nume = {"Alina", "Diana"};

        // parcurgem array-ul si pentru fiecare valoare aflam indexul + valoarea
        // for
        for (int i = 0; i < note.length; i++) {
            System.out.println("Pozitia elementului este " + i + " valoarea de pe pozitie este " + note[i]);
        }

        // while
        int note1 = 0;
        while (note1 < note.length) {
            System.out.println("Valoarea este " + note[note1]);
            note1++;
        }

        //foreach
        for (int j : note) {
            System.out.println("Pozitia array-ul din foreach " + j + " valoarea este " + j);
        }

        // call method contains
        int[] arr2 = {15, 20, 45, 18, 54, 13, 61};
        System.out.println("The answer is: " + containsArrayTheValue(note, 10));

        // call method copy

        int[] my_array = {10, 25, 14, 86, 29, 49, 9};
        int[] new_array = new int[10];
        System.out.println("The result after copy array is: " + Arrays.toString(copyArray(my_array, new_array)));
    }

    public static boolean containsArrayTheValue(int[] array, int value) {
        // n - the variable that store each value from array
        for (int n : array) {
            // value - the method parameter, the value that we're searching for
            if (value == n) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyArray(int[] array, int[] arrayToBeCopied) {
          for (int i = 0; i < array.length; i++){
              arrayToBeCopied[i] = array[i];
        }
        return arrayToBeCopied;
    }
}
