package hu.greenfox.bleaksmile;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double a = 20;
        double b = 10;
        double c = 50;

        double surface = 2*a*b + 2*b*c + 2*a*c ;
        double volume = a*b*c ;

        System.out.println("Surface area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
