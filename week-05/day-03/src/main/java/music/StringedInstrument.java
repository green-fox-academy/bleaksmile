package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument(String name, int number) {
        super(name);
        this.numberOfStrings = number;
    }

    public abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound() );
    }


}
