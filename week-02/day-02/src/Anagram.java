import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("kjkg", "jjkg"));

    }

    public static boolean anagram(String word1, String word2){
        char [] charWord1 = word1.toCharArray();
        char [] charWord2 = word2.toCharArray();
        Arrays.sort(charWord1);
        Arrays.sort(charWord2);

        if (charWord1.length != charWord2.length) {
            return false;
        }
        for (int i = 0; i <charWord1.length; i++) {
            if(charWord1[i]!= charWord2[i] ) {
                return  false;
            }
        }

        return true;
    }

}
