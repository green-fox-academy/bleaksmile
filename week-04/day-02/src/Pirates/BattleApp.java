package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship victory = new Ship();
        Ship santaMaria = new Ship();

        victory.fillShip();
        santaMaria.fillShip();

        System.out.println(victory.toString());
        System.out.println(santaMaria.toString());
        victory.getCaptain().die();

        System.out.println(victory.battle(santaMaria));
        System.out.println(victory.toString());
        System.out.println(santaMaria.toString());
    }


}
