import java.util.HashMap;

public class Main {
    //String type;
    //String leafColor;
    //int age;
    //String sex;


    public static void main(String[] args) {
       /* FamilyMember mom = new FamilyMember("A");
        FamilyMember dad = new FamilyMember("B");
        mom.age = 33;
        System.out.println(mom.age);
        System.out.println(dad.age);
        System.out.println(mom.name);
        System.out.println(dad.name);
        System.out.println(dad.surename);
        System.out.println(mom.surename);
        */

       Point p1 = new Point(2,5);
        System.out.println(p1.getX());
        p1.setX(-1);

        Human bob = new Human(75);
        Human joe = new Human(22);
        System.out.println(bob.isSmart());
        System.out.println(Human.alive);
        bob.alive =false;
        System.out.println(bob.alive);
        System.out.println(joe.alive);
        System.out.println(joe.getCount());
        System.out.println(bob.toString());
    }
}

   /* Create 5 trees
    Store the data of them in variables in your program
for every tree the program should store its'
    type
    leaf color
    age
    sex
    you can use just variables, or lists and/or maps
    */
   /* public static void main(String[] args) {
        HashMap<String,String> tree1 = new HashMap<>();
        tree1.put("type", "oak");
        tree1.put("leaf color", "green");
        tree1.put("age", "26");
        tree1.put("sex", "female");
    }
    */


