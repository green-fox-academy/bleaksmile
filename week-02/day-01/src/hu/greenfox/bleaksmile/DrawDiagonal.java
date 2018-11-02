package hu.greenfox.bleaksmile;


import java.util.Scanner;

public class DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was

    public static void main(String[] args) {
        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int j = 1; j <=number; j++) {
            System.out.print("%");
        }
        System.out.print("\n");
        for (int i=1; i<number-1; i++) {
            System.out.print("%");
            for (int l= 1; l<=number-2; l++){
                if (i==l){
                    System.out.print("%");
                }else {
                System.out.print(" ");}
            }
            System.out.print("%");
            System.out.print("\n");
        }
        for (int k = 1; k <=number; k++) {
            System.out.print("%");
        }



    }
}
