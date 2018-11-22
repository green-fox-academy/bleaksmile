import java.util.Arrays;

public class Anagram {

  boolean anagramCheck(String text1, String text2) {
    if (text1.length() != text2.length()) {
      return false;
    }
    char[] chars1 = text1.toCharArray();
    char[] chars2 = text2.toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);
    for (int i = 0; i < chars1.length; i++) {
      if (chars1[i] != chars2[i]) {
        return false;
      }
    }
    return true;
}

}
