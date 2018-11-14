package PetrolStation;

public class Car {
    int gasAmount;
    int capacity;

    public Car() {
        this.gasAmount = 40;
        this.capacity = 120;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gasAmount=" + gasAmount +
                ", capacity=" + capacity +
                '}';
    }
}
