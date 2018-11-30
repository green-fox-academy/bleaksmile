package Zoo;

public class Lion extends Animal{

  public Lion(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Lion(String name) {
    super(name);
  }

  @Override
  public boolean isHungry() {
    return true;
  }
}
