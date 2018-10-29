package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        double avg;

        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double sum =0;

        for (int i=0; i<number; i++){
            System.out.println("Add a number:");
            Scanner input1 = new Scanner(System.in);
            int num = input1.nextInt();
            sum +=num;
        }

        System.out.println(sum);
        avg = (double)sum/number;
        System.out.println(avg);

    }


}

