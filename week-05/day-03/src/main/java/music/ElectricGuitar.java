package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    public ElectricGuitar(int number) {
        super("Electric Guitar", number);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
