package org.example.HomeWork1;

import static org.example.HomeWork1.Hw2Task1.in;

public class Hw2Task2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int number = getNumber();
        value(number);
    }

    private static int getNumber() {
        return in.nextInt();
    }

    private static void value(int number) {
        if (number % 2 == 0) {
            System.out.println("you entered an even number");
        } else {
            System.out.println("you entered an odd number");
        }
    }
}

