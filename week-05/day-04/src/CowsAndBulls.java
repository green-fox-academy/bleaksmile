import java.util.Scanner;

public class CowsAndBulls {

  int goalToGuess;
  boolean playing;
  boolean finished;
  int guessCounter;

  public CowsAndBulls() {
    this.goalToGuess = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
    this.playing = true;
    this.finished = false;
    this.guessCounter = 0;
  }

  int userGuess;

  public void askUser() {
    System.out.println("Guess a four digit number");
    Scanner number = new Scanner(System.in);
    userGuess = number.nextInt();
    System.out.println("Your guess is " + userGuess);
  }

  public void checkTheDigits(int number) {
    String guessToString = Integer.toString(number);
    String goalToString = Integer.toString(goalToGuess);
    for (int i = 0; i < guessToString.length(); i++) {
      if (guessToString.charAt(i) == goalToString.charAt(i)) {
        System.out.print(" cow ");
      } else if (goalToString.contains(guessToString.charAt(i) + "")) {
        System.out.print(" bull ");
      } else {
        System.out.print(" "+ guessToString.charAt(i)+" ");
      }
    }
    System.out.println();
  }

  public void playGame(){
    askUser();
    checkTheDigits(userGuess);
    if(userGuess == goalToGuess){
      System.out.println("Congratulation, you won!");
      finished = true;
      playing = false;
    } else {
      playGame();
    }
  }
}

