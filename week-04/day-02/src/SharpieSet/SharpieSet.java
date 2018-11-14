package SharpieSet;

import Sharpie.Sharpie;

import java.util.ArrayList;
import java.util.List;

/*
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies
 */
public class SharpieSet {
    public List<Sharpie> listOfSharpies;

    public SharpieSet() {
        listOfSharpies = new ArrayList<Sharpie>();
    }

    public boolean countUsable() {
        return (Sharpie.getInkAmount() > 0);
    }

    public void removeTrash() {
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).getInkAmount() < 0) {
                listOfSharpies.remove(i);
            }
        }

    }

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "listOfSharpies=" + listOfSharpies +
                '}';
    }
}
