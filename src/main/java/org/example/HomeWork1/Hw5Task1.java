package org.example.HomeWork1;

import java.util.Scanner;

public class Hw5Task1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number lines: ");
        int size1 = in.nextInt();
        System.out.println("Enter number columns");
        int size2 = in.nextInt();
        int[][] array = new int[size1][size2];
        fillArray(array);
    }

    private static void fillArray(int[][] array) {
        int s = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s;
                s++;
            }
        }
        for (int i = 0; i < array.length; ++i) {
            if (i % 2 == 1) {
                for (int j = 0; j < array[i].length; ++j) {
                    array[i][j] = -1 * array[i][j];
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = 0; j < array[i].length; ++j) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
