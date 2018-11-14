package Sharpie;

public class Main {

    /*

    Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount
     */
    public static void main(String[] args) {
        Sharpie mine = new Sharpie("blue", 3.6f);
        Sharpie yours = new Sharpie("green", 5.6f);

        System.out.println(mine.getInkAmount());
        System.out.println(yours.use());
        System.out.println(yours.use());
        System.out.println(yours.getInkAmount());

        System.out.println(mine.getInkAmount());


    }
}
