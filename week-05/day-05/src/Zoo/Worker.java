package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {
  private String name;
  private List<Animal> animalsToLookAfter;


  public Worker(String name, List<Animal> animalsLookAfter) {
    this.name = name;
    this.animalsToLookAfter = animalsLookAfter;
  }

  public Worker(String name) {
    this.name = name;
    this.animalsToLookAfter = new ArrayList<>();
  }

  public void doDailyRoutine() {
    for (Animal animal : animalsToLookAfter) {
      if(animal.isHungry()){
        animal.eat();
      }
    }
  }

  public void setAnimalsToLookAfter(List<Animal> animalsLookAfter) {
    this.animalsToLookAfter = animalsLookAfter;
  }

}
