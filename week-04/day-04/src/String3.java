public class String3 {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(textWithAsterisk("apple"));

    }

    public static String textWithAsterisk(String text) {
        String output = Character.toString(text.charAt(0));
        if (text.length() == 1) {
            return output;
        } else {
            return output + '*' + textWithAsterisk(text.substring(1));
        }
    }
}

