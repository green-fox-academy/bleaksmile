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

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
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
        if (needsWater()) {
            return "The " + getColor() + " " + getClass().getSimpleName() + " needs water.";
        } else {
            return "The " + getColor() + " " + getClass().getSimpleName() + " does not need water.";
        }
    }

}
