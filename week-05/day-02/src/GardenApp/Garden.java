package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> garden = new ArrayList<>();


    public void addPlant(Plant plant) {
        garden.add(plant);
    }

    public void wateringPlants(double number) {
        System.out.println("Watering with " + number);
        int counter = 0;
        for (Plant plant : garden) {
            if (plant.needsWater()) {
                counter++;
            }
        }
        for (Plant plant : garden) {
            if (plant.needsWater()) {
                plant.watering(number / counter);
            }
        }
        checkWater();
    }

    public void checkWater() {
        for (Plant plant : garden) {
            System.out.println(plant.toString());
        }
    }


}
