package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        int i, j, k, number;
        Scanner input = new Scanner(System.in);
        System.out.println("Add a number: ");
        number = input.nextInt();

        for (i=1; i<=number; i++)
        {
            for (j=i; j<=number; j++){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }





    }

}



