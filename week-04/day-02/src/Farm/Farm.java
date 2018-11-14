package Farm;

import Animal.Animal;

import java.util.List;
/*
Farm
Reuse your Animal class
Create a Farm class
it has list of Animals
it has slots which defines the number of free places for animals
breed() -> creates a new animal if there's place for it
slaughter() -> removes the least hungry animal
*/

public class Farm {
    List<Animal> listOfAnimals;
    int slot;

    public Farm() {

    }

    public void breed() {
        if (slot > 0) {
            listOfAnimals.add(new Animal());
        }
    }

    public void slaughter() {
        Animal leasthungry = listOfAnimals.get(0);
        for (int i = 1; i < listOfAnimals.size(); i++) {
            if (listOfAnimals.get(i).hunger < leasthungry.hunger) {
                leasthungry.hunger = listOfAnimals.get(i).hunger;
                leasthungry = listOfAnimals.get(i);
            }
        }
        listOfAnimals.remove(leasthungry);
    }

}
