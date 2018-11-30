package Zoo;

public abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private int feedTimes;

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Animal(String name) {
    this.name = name;
    this.age = 0;
    this.gender = "unknown";
  }

  protected void eat() {
    feedTimes++;
  }

  protected abstract boolean isHungry();

  @Override
  public String toString() {
    return this.name + " is a " + this.age + " years old "
            + this.gender + " animal and was fed " + this.feedTimes;

  }
}
