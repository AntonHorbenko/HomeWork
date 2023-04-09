package org.example.HomeWork1;

import java.util.Arrays;
import java.util.Random;

public class Hw4Task4 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
            System.out.print(array[i] + ",");
        }
        System.out.println();
        swap(array);
    }

    private static void swap(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            if (copyArray[i] % 2 == 0) {
                copyArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
