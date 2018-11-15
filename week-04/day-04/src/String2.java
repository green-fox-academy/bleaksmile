public class String2 {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        System.out.println(removeX("XwXaOxpOpx"));
    }

    public static String removeX(String text) {
        if (text.length() == 0) {
            return "";
        } else if (text.charAt(0) == 'x' || text.charAt(0) == 'X') {
            return "" + removeX(text.substring(1));
        } else {
            return text.charAt(0) + removeX(text.substring(1));
        }
    }
}
