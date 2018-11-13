package Animal;

public class Animal {
    int hunger = 50;
    int thirst = 50;
      /*
    Animal
    Create an Animal class
    Every animal has a hunger value, which is a whole number
    Every animal has a thirst value, which is a whole number
    when creating a new animal object these values are created with the default 50 value
    Every animal can eat() which decreases their hunger by one
    Every animal can drink() which decreases their thirst by one
    Every animal can play() which increases both by one
    */
      public Animal(){

      }

      public int eat(){
          return hunger -= 1;
      }

      public int drink (){
          return  thirst -= 1;
      }

    public void play (){
          hunger += 1;
          thirst += 1;

    }
}
