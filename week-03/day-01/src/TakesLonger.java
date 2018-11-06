
public class TakesLonger {
    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
      public static void main(String[] args){
      String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String substring = "always takes longer than";
        int n = quote.indexOf("It");
        quote = quote.substring(0, n+2) + " " + substring + quote.substring(n+2,quote.length());
        System.out.println(quote);
    }
}
