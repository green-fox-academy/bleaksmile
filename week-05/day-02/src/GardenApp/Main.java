package GardenApp;

public class Main {
    public static void main(String[] args) {
        Flower blueFlower = new Flower("blue");
        Flower yellowFlower = new Flower("yellow");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");
        Garden myGarden = new Garden();

        myGarden.addPlant(yellowFlower);
        myGarden.addPlant(blueFlower);
        myGarden.addPlant(purpleTree);
        myGarden.addPlant(orangeTree);

        myGarden.checkWater();
        System.out.println();
        myGarden.wateringPlants(40.0);
        System.out.println();
        myGarden.wateringPlants(70.0);
    }

}
