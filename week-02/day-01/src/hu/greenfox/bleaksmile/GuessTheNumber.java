package hu.greenfox.bleaksmile;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 50 + 1);

        int guessResult = 1;

        while(guessResult == 1) {
            System.out.println("Guess a number between 1 and 50:");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            if (random == number) {
                System.out.println("You found the number: " + random);
                guessResult = -1;
            } else if (random < number) {
                System.out.println("The stored number is lower.");
            } else {
                System.out.println("The stored number is higher.");
            }
        }
    }
}
