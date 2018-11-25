public class String3 {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        System.out.println(textWithAsterisk("apple"));
    }

    public static String textWithAsterisk(String text) {
        if (text.length() == 0) {
            return "";
        }
        if (text.length() == 1) {
            return text;
        } else {
            return text.charAt(0) + "*" + textWithAsterisk(text.substring(1));
        }
    }
}