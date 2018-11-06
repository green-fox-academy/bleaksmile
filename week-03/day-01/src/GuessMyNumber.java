import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        guessMyNumber();
    }

    public static void guessMyNumber(){
        System.out.println("Give me the range of your guesses: ");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int random = (int)(Math.random()* range+1);
       // System.out.println(random);
        int life =5;
        boolean found = false;
        System.out.println("You have 5 lifes.");

        while (found == false){
            if (life == 0){
                System.out.println("Sorry, you lost");
                System.out.println("My number was " + random);
                break;
            }
            System.out.println("Give me your guess: ");
            Scanner userinput = new Scanner(System.in);
            int guess = userinput.nextInt();
            if (random == guess) {
                System.out.println("You won!");
                found = true;
            } else if (random < guess){
                System.out.println("Your guess is too high");
                life --;
                System.out.println("Number of lives: " + life);
            } else {
                System.out.println("Your guess is too low");
                life--;
                System.out.println("Number of lives: " + life);
            }
        }


    }
}
