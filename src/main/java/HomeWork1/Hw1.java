package HomeWork1;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        int value = 5;
        int step = 0;
        if (name.length() > 7) {
            System.out.println("more than 7");
        } else if (name.length() < 7) {
            System.out.println("less than 7");
        }else{
            System.out.println("your name is seven letters long ");
        }
        System.out.println();
        while (step <= 10) {
            System.out.println("Step: " + step + ",value" + value);
            step++;
            value+=2;
        }
        System.out.println("Name: " + name+ " last name: " + lastName);
    }
}
