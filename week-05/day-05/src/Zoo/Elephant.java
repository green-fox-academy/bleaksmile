package Zoo;

public class Elephant extends Animal {
  private int visitNumber = 0;
  public Elephant(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Elephant(String name) {
    super(name);
  }

  @Override
  protected boolean isHungry() {
    visitNumber ++;
     return visitNumber%2 ==0;
  }
}
