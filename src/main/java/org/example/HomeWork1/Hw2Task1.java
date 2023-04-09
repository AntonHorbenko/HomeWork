package org.example.HomeWork1;

import java.util.Scanner;

public class Hw2Task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number 1 : ");
        double number1 = getNumber();
        System.out.print("Enter a number 2 : ");
        double number2 = getNumber();
        System.out.print("Enter a number 3 : ");
        double number3 = getNumber();
        double result = getResult(number1, number2, number3);
        System.out.println("Result: " + result);

    }

    private static double getNumber() {
        return in.nextDouble();
    }

    private static double getResult(double number1, double number2, double number3) {
        double pp = ((number1 + number2 + number3) / 2);
        double result = (Math.sqrt(pp * (pp - number1) * (pp - number2) * (pp - number3)));
        if (result <= 0) {
            System.out.println("the data is not true");
        }
        return result;
    }
}
