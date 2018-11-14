package PetrolStation;

public class Main {
    public static void main(String[] args) {
    /*
    Petrol Station
Create Station and Car classes
Station
    gasAmount
    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
    gasAmount
    capacity
    create constructor for Car where:
    initialize gasAmount -> 0
    initialize capacity -> 100
     */
        Car bmw = new Car();
        Station shell = new Station();

        shell.refill(bmw);
        System.out.println(bmw);
        System.out.println("----");
        System.out.println(shell);


    }

}
