package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    private List<Ship> armada = new ArrayList<>();

    public Armada() {
        armadaFill();
    }

    public void armadaFill() {
        int random = (int) (Math.random() * 3 + 1);
        for (int m = 0; m < random; m++) {
            Ship shipAdd = new Ship();
            shipAdd.fillShip();
            armada.add(shipAdd);
        }
    }

    public Ship getShip(int a) {
        return this.armada.get(a);
    }

    public int getSize() {
        return this.armada.size();
    }

  /*  public boolean war(Armada opponentArmada) {
        int armadaScore = armada.size()-1;
        int opponentScore = opponentArmada.getSize()-1;
        while(armadaScore ==-1 && opponentScore == -1){
                if(armada.get(armadaScore).battle(opponentArmada.getShip(oponentScore))) {
                    oponentScore --;
                } else {
                    armadaScore --;
                }
        }
        if (oponentScore == -1) {
            return true;
        } else {
            return false;
        }
    }
    */

    public boolean battleWithDestroy(Armada opponent) {
        while (getSize() != 0 && opponent.getSize() != 0) {
            if (getShip(0).battle(opponent.getShip(0))) {
                opponent.armada.remove(0);
            } else {
                armada.remove(0);
            }
        }
        return opponent.getSize() == 0;
    }

    @Override
    public String toString() {
        return "Armada{armadaSize: " + armada.size() +
                " armada=" + armada +
                '}';
    }
}
