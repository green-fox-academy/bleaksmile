package hu.greenfox.bleaksmile;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner input = new Scanner(System.in);
        System.out.println("Add a distance in kilometers: ");
        int km = input.nextInt();
        double mile = km/1.609344;

        System.out.println("Converted to miles: " + mile);
    }
}
