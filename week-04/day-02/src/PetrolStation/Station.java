package PetrolStation;

//refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
public class Station {
    int gasAmount = 500;

    public Station() {

    }

    public void refill(Car car) {
        this.gasAmount -= (car.capacity - car.gasAmount);
        car.gasAmount = car.capacity;
    }

    @Override
    public String toString() {
        return "Station{" +
                "gasAmount=" + gasAmount +
                '}';
    }
}
