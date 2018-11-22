import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      int median1 = pool.get((pool.size() - 1) / 2);
      int median2 = pool.get(pool.size() / 2);
      return (double) (median1 + median2) / 2;
    } else {
      return pool.get((pool.size() - 1) / 2);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = "";
    for (int i = 0; i < hungarian.length(); i++) {
      char c = hungarian.charAt(i);
      if (isVowel(c)) {
        teve += c + "v" + c;
      } else {
        teve += c;
      }
    }
    return teve;
    }
  }