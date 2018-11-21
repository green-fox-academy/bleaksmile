package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super("Bass Guitar", 4);
    }

    public BassGuitar(int number){
        super("Bass Guitar", number);
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
