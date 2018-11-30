import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Zoo.Animal;
import Zoo.Worker;
import Zoo.Elephant;
import Zoo.Monkey;
import Zoo.Lion;

public class Zoo {

  static List<Animal> animals = new ArrayList<>();
  static List<Worker> workers = new ArrayList<>();

  public static void main(String[] args) {
    Animal dumbo = new Elephant("Dumbo", 15, "male");
    Animal leopold = new Elephant("Leopold");
    Animal simba = new Lion("Simba", 3, "male");
    Animal elsa = new Lion("Elsa", 8, "female");
    Animal uk = new Monkey("Uk");
    Animal muk = new Monkey("Muk");
    Animal ukmuk = new Monkey("Ukmuk");

    Worker kate = new Worker("Kate");
    Worker mandy = new Worker("Mandy");

    animals.addAll(Arrays.asList(dumbo, leopold, simba, elsa, uk, muk, ukmuk));

    workers.add(kate);
    workers.add(mandy);

    kate.setAnimalsToLookAfter(animals.subList(0, 3));
    mandy.setAnimalsToLookAfter(animals.subList(3, animals.size()));

    for (int i = 0; i < 6; i++) {
      checkAnimals();
    }

    for(Animal animal : animals) {
      System.out.println(animal);
    }
  }

  private static void checkAnimals() {
    for (Worker worker : workers) {
      worker.doDailyRoutine();
    }
  }
}
