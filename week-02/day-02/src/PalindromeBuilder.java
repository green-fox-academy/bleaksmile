

public class PalindromeBuilder {
    public static void main(String[] args) {

        System.out.println(palindrome("greenfox"));
    }

    public static String palindrome(String input){

        for (int i = input.length()-1; i >=0 ; i--){
            input += input.charAt(i);

        }

        return input;
    }

}
