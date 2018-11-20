package Aircrafts;

public class Main {
    public static void main(String[] args) throws Exception {
        F16 plane1 = new F16();
        F35 plane2 = new F35();
        F16 plane3 = new F16();
        F35 plane4 = new F35();
        F35 plane5 = new F35();

        F16 plane6 = new F16();
        F16 plane7 = new F16();
        F16 plane8 = new F16();
        F35 plane9 = new F35();

        Carrier myCarrier = new Carrier(2300,5000);
        Carrier opponentCarrier = new Carrier(10,20);

        myCarrier.add(plane1);
        myCarrier.add(plane2);
        myCarrier.add(plane3);
        myCarrier.add(plane4);
        myCarrier.add(plane5);

        opponentCarrier.add(plane6);
        opponentCarrier.add(plane7);
        opponentCarrier.add(plane8);
        opponentCarrier.add(plane9);

        System.out.println(myCarrier.getStatus());
        System.out.println();
        System.out.println(opponentCarrier.getStatus());
        System.out.println();
        System.out.println("Filling the aircrafts ....");
        myCarrier.fill();
        System.out.println(myCarrier.getStatus());
        opponentCarrier.fill();
        System.out.println(opponentCarrier.getStatus());
        System.out.println();
        System.out.println("The fight has been started ...");
        myCarrier.fight(opponentCarrier);
        System.out.println(myCarrier.getStatus());
        System.out.println();
        System.out.println(opponentCarrier.getStatus());

    }
}
