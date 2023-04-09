package org.example.HomeWork1;

import java.util.Arrays;

public class Hw5Task2 {
    public static void main(String[] args) {
        int[] array = {7, 5, 8, 9, 4, 6, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(method((array)));
    }

    private static boolean method(int[] array) {
        boolean check = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                check = false;
                break;
            }
        }
        System.out.println("*********");
        return check;
    }
}
