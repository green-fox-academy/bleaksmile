package Charsequence;

public class Shifter implements CharSequence{
    String toBeShifted;
    int numberOfShift;

    public Shifter(String toBeShifted, int number) {
        this.toBeShifted = toBeShifted;
        this.numberOfShift = number;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
