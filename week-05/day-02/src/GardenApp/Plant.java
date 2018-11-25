package GardenApp;

public class Plant {
    private String color;
    private double waterAmount = 0;
    private double absorbLevel;
    private double minWater;


    public Plant(String color, double absorbLevel, double minWater) {
        this.color = color;
        this.absorbLevel = absorbLevel;
        this.minWater = minWater;
    }

    public String getColor() {
        return color;
    }

    public boolean needsWater() {
        return waterAmount < minWater;
    }

    public void watering(double water) {
        waterAmount += water * absorbLevel;
    }

    public String toString() {
        return "The " + getColor() + " " + getClass().getSimpleName() + (needsWater() ? " needs" : " doesn't need") + " water.";
    }

}
