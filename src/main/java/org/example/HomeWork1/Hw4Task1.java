package org.example.HomeWork1;

import java.util.Arrays;
import java.util.Random;

public class Hw4Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10) + 1;
            System.out.println(array[i]);
        }

        System.out.println("Arithmetic: " + getArithmetic(array));
        System.out.println("Geomeric: " + getGeometry(array));
    }

    private static double getArithmetic(int[] array) {
        double arithmetic = 0.0;
        int[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copiedArray.length; i++) {
            arithmetic += copiedArray[i];
        }
        arithmetic /= copiedArray.length;
        return arithmetic;
    }

    private static double getGeometry(int[] array) {
        double geometry = 1;
        int[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copiedArray.length; i++) {
            geometry *= copiedArray[i];
        }
        geometry = Math.pow(geometry, 1.0 / copiedArray.length);
        return geometry;
    }
}

