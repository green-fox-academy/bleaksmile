package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacle = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        stand.complete();
        Thing eat = new Thing("Eat lunch");
        Thing listen2 = new Thing("Listen to radio");
        Thing listen = new Thing ("Listen to music");

        listen.complete();
        //eat.complete();
        fleet.add(listen2);
       // listen2.complete();
        fleet.add(milk);
        fleet.add(obstacle);
        fleet.add(stand);
        fleet.add(eat);
        fleet.add(listen);

        for (Thing t : fleet.getThings()){
            t.printAllFields();
        }

        System.out.println(fleet);
        System.out.println();

        Collections.sort(fleet.getThings());
        System.out.println(fleet);


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

    }
}