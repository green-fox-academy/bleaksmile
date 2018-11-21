package main.java.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super("Violin", 4);
    }

    public Violin(int number){
        super("Violin", number);
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
