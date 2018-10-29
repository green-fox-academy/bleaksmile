package hu.greenfox.bleaksmile;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("Number of chickens: ");
        Scanner input1 = new Scanner(System.in);
        int chickenNo = input1.nextInt();
        System.out.println("Number of pigs: ");
        Scanner input2 = new Scanner(System.in);
        int pigNo = input2.nextInt();
        System.out.println("Legs all together: " + (chickenNo*2 + pigNo *4));


    }
}
