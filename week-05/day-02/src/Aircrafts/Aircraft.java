package Aircrafts;

public class Aircraft {
    private int ammoStore;
    private int maxAmmo;
    private int baseDamage;
    private boolean priority;

    public Aircraft(int maxAmmo, int baseDamage, boolean priority) {
        this.priority = priority;
        this.ammoStore = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public int getAmmoStore() {
        return ammoStore;
    }

    public boolean getPriority() {
        return priority;
    }

    public int fight() {
        int allDamage = baseDamage * ammoStore;
        ammoStore = 0;
        return allDamage;
    }

    public int refill(int number) {
        int temp = ammoStore;
        if (ammoStore == maxAmmo) {
            return number;
        }
        if (number < maxAmmo - ammoStore) {
            ammoStore += number;
            return 0;
        } else {
            ammoStore = maxAmmo;
            return number - maxAmmo + temp;
        }
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + (baseDamage*ammoStore);
    }


}
