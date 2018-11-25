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

  public int askUser() {
    System.out.println("Guess a four digit number");
    Scanner number = new Scanner(System.in);
    userGuess = number.nextInt();
    guessCounter ++;
    System.out.println("Your guess is " + userGuess);
    return userGuess;
  }

  public void checkTheDigits(int number) throws Exception {
    String guessToString = Integer.toString(number);
    String goalToString = Integer.toString(goalToGuess);
    if(guessToString.length() !=4){
      throw new Exception("This is not a 4 digit number");
    }
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

  public boolean areEguals(int userGuess){
    return userGuess == goalToGuess;
  }

  public void playGame() throws Exception {
    askUser();
    checkTheDigits(userGuess);
    if(areEguals(userGuess)){
      System.out.println("Congratulation, you won! You guessed " + guessCounter + " times.");
      finished = true;
      playing = false;
    } else {
      playGame();
    }
  }
}

