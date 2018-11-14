package Fleet;

import java.util.ArrayList;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacle = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        stand.complete();
        Thing eat = new Thing("Eat lunch");
        eat.complete();
        fleet.add(milk);
        fleet.add(obstacle);
        fleet.add(stand);
        fleet.add(eat);


        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


        System.out.println(fleet);
    }
}