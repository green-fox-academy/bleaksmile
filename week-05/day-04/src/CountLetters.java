import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountLetters {

  public static HashMap letterCounter(String inputText) {
    HashMap<String, Integer> outputHash = new HashMap<>();
    for (int i = 0; i < inputText.length(); i++) {
      String text = inputText.charAt(i) + "";
      if (outputHash.containsKey(text)) {
        outputHash.put(text, outputHash.get(text) + 1);
      } else {
        outputHash.put(text, 1);
      }
    }
    return outputHash;
  }
}
