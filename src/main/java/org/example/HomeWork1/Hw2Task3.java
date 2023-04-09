package org.example.HomeWork1;

import static org.example.HomeWork1.Hw2Task1.in;

public class Hw2Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number 1: ");
        int number1 = getNumber();
        System.out.println("Enter number 2: ");
        int number2 = getNumber();
        System.out.println("Enter number 3: ");
        int number3 = getNumber();
        int result = getResult(number1, number2, number3);
        System.out.println("minimum module: " + result);
    }

    private static int getNumber() {
        return in.nextInt();
    }

    private static int getResult(int number1, int number2, int number3) {
        int abs1 = Math.abs(number1);
        int abs2 = Math.abs(number2);
        int abs3 = Math.abs(number3);
        return (abs1 < abs2) ? (Math.min(abs1, abs3)) : (Math.min(abs2, abs3));
    }
}
