package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i=1; i<=number/2+1; i++){
            for (int j=i; j<number; j++){
                System.out.print(" ");
            }
            for (int k=1; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
        for (int l=number/2; l>0; l--){
            for (int m=l; m<number; m++) {
                System.out.print(" ");
            }
            for (int n=1; n<(l*2); n++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
