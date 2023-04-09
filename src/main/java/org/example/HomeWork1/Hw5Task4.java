package org.example.HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw5Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter lines: ");
        int size1 = in.nextInt();
        System.out.print("Enter coulomb: ");
        int size2 = in.nextInt();
        int[][] array = new int[size1][size2];
        value(array);
        System.out.print(Arrays.deepToString(deleteArray(array)));


    }

    private static void value(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(1, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] deleteArray(int[][] array) {
        int[][] copyArray = new int[array.length - 1][array[0].length - 1];
        System.out.println("Enter for delete line element: ");
        int index1 = in.nextInt();
        System.out.println("Enter for delete coulomb element: ");
        int index2 = in.nextInt();
        int copyI = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                continue;
            }
            int copyJ = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (j == index2) {
                    continue;
                }
                copyArray[copyI][copyJ] = array[i][j];
                copyJ++;
            }
            copyI++;
        }
        return copyArray;
    }
}
