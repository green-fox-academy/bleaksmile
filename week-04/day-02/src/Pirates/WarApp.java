package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada spanish = new Armada();
        Armada english = new Armada();

        System.out.println(spanish);
        System.out.println(english);
        System.out.println(spanish.getSize());
        System.out.println(english.getSize());

        System.out.println(spanish.battleWithDestroy(english));
        System.out.println(spanish.getSize());
        System.out.println(english.getSize());
    }
}
