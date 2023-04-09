package org.example.HomeWork1;

import java.util.Scanner;

public class Hw3Task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter text: ");
        String text = in.nextLine();
        palindrome(text);
    }

    private static void palindrome(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[\\s]", " ");
        String revers = new StringBuffer(text).reverse().toString();
        if (text.equals(revers)) {
            System.out.println("text is a palindrome ");
        } else {
            System.out.println("text is not a palindrome ");
        }
    }
}
