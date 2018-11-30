package Hero_Battle;

public class Hero extends BaseHero implements Punchable {
  protected double motivation;

  Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  @Override
  public void punch(Punchable other) {
    if (this.motivation >= 1) {
      other.bePunched(this.motivation / 1.5);
    }
  }

  @Override
  public int getMotivationLevel() {
    if (motivation < 25) {
      return 0;
    } else if (motivation >= 25 && motivation <= 40) {
      return 1;
    } else {
      return 2;
    }
  }

  @Override
  public void bePunched(double damage) {
    double temp = motivation;
    this.motivation = temp - (damage / temp);

  }

  @Override
  public String toString() {
    if (getMotivationLevel() == 0) {
      return getName() + " is not motivated anymore.";
    } else if (getMotivationLevel() == 1) {
      return getName() + " is motivated.";
    } else {
      return getName() + " is well motivated.";
    }
  }
}




