public class String1 {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        System.out.println(stringModifier("vxoyox"));
    }

    public static String stringModifier(String input) {
        int n = 0;
        if (input.length() == 0) {
            return "";
        } else if (input.charAt(0) == 'x') {
            return "y" + stringModifier(input.substring(1));
        } else {
            return input.charAt(0) + stringModifier(input.substring(1));
        }
    }
}
