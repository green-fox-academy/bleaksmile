package hu.greenfox.bleaksmile;
import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("Add 5 integers: ");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        int c = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        int d = input4.nextInt();
        Scanner input5 = new Scanner(System.in);
        int e = input5.nextInt();

        int sum = a + b + c + d + e;
        double avg = sum/5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);




    }
}
