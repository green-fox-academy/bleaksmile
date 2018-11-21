package Charsequence;

public class Gnirts implements CharSequence{
    String text;

    public Gnirts(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder output = new StringBuilder(this.text);
        output.reverse();
        return output.toString().substring(start,end);
    }
}
