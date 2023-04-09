package org.example.HomeWork1;

import java.util.Scanner;

public class Hw3Task2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = in.nextLine();
        System.out.println("number of words : "+count(text));
    }
    public static int count(String text) {
        int count = 0;
        text = text.replaceAll("[\\s]{2,}", " ");
        String[] words = text.split(" ");
        count += words.length;
        return count;
    }
}
