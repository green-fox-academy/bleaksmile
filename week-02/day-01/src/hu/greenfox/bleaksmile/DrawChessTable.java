package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i=1; i<=number/2; i++){
            for (int j=0; j<number/2; j++) {
                System.out.print("% ");
            }
            System.out.print("\n");
            for (int k=0; k<number/2; k++) {
                System.out.print(" %");
            }
            System.out.print("\n");
        }
    }
}
