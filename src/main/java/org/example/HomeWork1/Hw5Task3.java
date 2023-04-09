package org.example.HomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Hw5Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line and coulombs array");
        int size = in.nextInt();
        int[][] array = new int[size][size];
        valueArray(array);
        System.out.println("main Spase ");
        swapLineCoulomb(array);
    }

    private static int[][] valueArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(1, 10);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        return array;
    }

    private static int[][] copyArray(int[][] array) {
        int[][] copy = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                copy[j][i] = array[i][j];
            }
        }
        return copy;
    }

    private static int[][] swapLineCoulomb(int[][] array) {
        int[][] arraySwap = copyArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySwap[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(arraySwap[i][j] + " ");
            }
            System.out.println();
        }
        return arraySwap;
    }
}
