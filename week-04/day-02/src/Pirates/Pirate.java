package Pirates;

public class Pirate {
    private int rumCounter = 0;
    private boolean isAlive = true;
    private String parrot;
    private boolean isCaptain;
    private int callDrink;

    public Pirate(boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    public void drinkSomeRum(int rumAmount) {
        if (!isAlive) {
            System.out.println("he is dead");
            return;
        }
        rumCounter += rumAmount;
        callDrink++;
    }

    public void howsItGoingMate() {
        if (!isAlive) {
            System.out.println("he is dead");
            return;
        }
        if (callDrink < 5) {
            System.out.println("Pour me anudder!");
            drinkSomeRum(1);
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        isAlive = false;

    }

    public void brawl(Pirate opponentPirate) {
        if (!opponentPirate.isAlive()) {
            System.out.println("you can not brawl with a dead pirate!");
            return;
        }
        int chance = (int) (Math.random() * 3 + 1);
        if (chance == 1) {
            die();
        } else if (chance == 2) {
            opponentPirate.die();
        } else {
            die();
            opponentPirate.die();
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public int getRumCounter() {
        return rumCounter;
    }
}
