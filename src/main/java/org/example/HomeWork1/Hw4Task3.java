package org.example.HomeWork1;


import java.util.Arrays;
import java.util.Random;

public class Hw4Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
            System.out.println(array[i]);
        }
        System.out.println("composite count: "+ compositeNumber(array));
    }

    private static int compositeNumber(int[] array) {
        int compositeCount = 0;
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copyArray.length; i++) {
            if (isComposite(i)) {
                compositeCount++;
            }
        }
        return compositeCount;
    }

    private static boolean isComposite(int num) {
        if (num < 2) {
            //если num меньше < 2, получаем false
            return false;
        }
        // проверка, на то, делится ли num на какое либо число кроме 1 и самого себя , ели делится то число
        //составное и возвращаем true если нет - false
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
