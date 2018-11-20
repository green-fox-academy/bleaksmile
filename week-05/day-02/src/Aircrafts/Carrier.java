package Aircrafts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrier {
    List<Aircraft> carrier;
    private int storeOfAmmo;
    private int healthPoint;

    public Carrier(int storeOfAmmo, int healthPoint) {
        this.carrier = new ArrayList<>();
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill() throws Exception {
        if (storeOfAmmo <= 0) {
            throw new Exception("There is no ammo in the store.");
        } else {
            carrier.sort(Comparator.comparing(Aircraft::getPriority));
            for (int i = carrier.size() - 1; i >= 0 && storeOfAmmo > 0; i--) {
                int temp = storeOfAmmo;
                storeOfAmmo = carrier.get(i).refill(temp);
            }
        }
    }

    public int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : carrier) {
            totalDamage += aircraft.getBaseDamage() * aircraft.getAmmoStore();
        }
        return totalDamage;
    }

    public void fight(Carrier opponentCarrier) {
        opponentCarrier.healthPoint -= totalDamage();
        for (Aircraft aircraft : carrier) {
            aircraft.fight();
        }
    }

    public String getStatus() {
        StringBuilder outputText = new StringBuilder();
        if (healthPoint <= 0) {
            outputText.append("It's dead Jim :( ");
        } else {
            outputText.append("HP:");
            outputText.append(healthPoint);
            outputText.append(", Aircraft count: ");
            outputText.append(carrier.size());
            outputText.append(", Ammo Storage: ");
            outputText.append(storeOfAmmo);
            outputText.append(", Total damage: ");
            outputText.append(totalDamage());
            outputText.append("\n");
            outputText.append("Aircrafts: ");
            outputText.append("\n");
            for (Aircraft aircraft : carrier) {
                outputText.append(aircraft.getStatus());
                outputText.append("\n");
            }
        }
        return outputText.toString();
    }
}







