package org.example.HomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Hw3Task3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number for play: ");
        int numberUser = getNumber();
        int random = getRandom();
        int count = getResult(numberUser, random);
        System.out.println("***u are winner***" + "\nattempt number: " + count);

    }

    private static int getRandom() {
        Random random = new Random();
        return random.nextInt(100)+1;
    }

    private static int getNumber() {
        return in.nextInt();
    }

    private static int getResult(int numberUser, int random) {
        int count = 1;
        while (numberUser != random) {
            if (numberUser > random) {
                System.out.println("число большее, чем загадал компьютер, введите меньше: ");
                numberUser = getNumber();
                count++;
            } else if (numberUser < random) {
                System.out.println("число меньшее, чем загадал компьютер, введите больше: ");
                numberUser = getNumber();
                count++;
            } else {
            }

        }
        return count;
    }
}
