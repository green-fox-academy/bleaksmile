package Hero_Battle;

public class MarvelHero extends Hero {

  MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  MarvelHero(String name){
    super(name,40);
  }

  public void punch(Punchable other) {
    if (other instanceof DCHero) {
      super.punch(other);
     // other.bePunched(this.motivation / 1.5);
    }
  }
}
