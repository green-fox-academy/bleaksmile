package DiceSet;


/*
DiceSet
You have a DiceSet class which has 6 dices
You can roll all of them with roll()
Check the current rolled numbers with getCurrent()
You can reroll with reroll()
Your task is to roll the dices until all of the dices are 6
 */
public class Main {
    public static void main(String[] args) {
        DiceSet myDices = new DiceSet();

        for (int i = 0; i < myDices.dices.length; i++) {
            boolean notSix = true;
            while (notSix) {
                if (myDices.dices[i] != 6) {
                    myDices.reroll(i);
                } else {
                    notSix = false;
                }
            }
        }


        for (int j = 0; j < myDices.dices.length; j++) {
            System.out.print(myDices.getCurrent(j) + " ");
        }
    }
}
