package org.example.HomeWork1;

import java.util.Arrays;
import java.util.Random;


public class Hw4Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println("prime count: " +primeNumbers(array));

    }

    private static int primeNumbers(int[] array) {
        int primeCount = 0;
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            array[i] = 0;
            if (isPrime(copyArray[i])) {
                primeCount++;
            }
        }
        return primeCount;

    }

    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
