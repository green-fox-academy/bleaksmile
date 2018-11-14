package SharpieSet;

import Sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     Sharpie Set
    Reuse your Sharpie class
    Create SharpieSet class
    it contains a list of Sharpie
    countUsable() -> sharpie is usable if it has ink in it
    removeTrash() -> removes all unusable sharpies
     */
    public static void main(String[] args) {
        SharpieSet newSharpiset = new SharpieSet();
        newSharpiset.add(new Sharpie("black", 3.5f));
        newSharpiset.add(new Sharpie("white", 6.6f));
        System.out.println(newSharpiset);
        System.out.println("--------------------------");
        for (int i = 0; i < 11; i++) {
            newSharpiset.listOfSharpies.get(0).use();
        }

        System.out.println(newSharpiset.listOfSharpies.get(0).getInkAmount());

        System.out.println(newSharpiset.countUsable());
        newSharpiset.removeTrash();
        System.out.println(newSharpiset);


    }
}
