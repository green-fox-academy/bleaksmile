package Zoo;

public class Monkey extends Animal {
  public Monkey(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Monkey(String name) {
    super(name);
  }

  @Override
  public boolean isHungry() {
    int random = (int)(Math.random()*2);
    return  random ==0;

  }
}
