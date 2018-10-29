package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.println("Add a number: ");
        int number = input.nextInt();
        String k = "";

        for (int i = 1; i <= number; i++){
            k += "*";
            System.out.println(k);
        }
    }
}
