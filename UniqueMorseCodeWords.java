import java.util.*;

public class UniqueMorseCodeWords {

  public static String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
      "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

  public static int uniqueCodeWords(String[] words) {
    HashMap<Character, String> map = new HashMap<>();
    int x = 0;

    for (char i = 'a'; i <= 'z'; i++)
      map.put(i, code[x++]);

    HashSet<String> set = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      String str = words[i];
      StringBuffer buffer = new StringBuffer("");

      for (int j = 0; j < str.length(); j++) 
        buffer.append(map.get(str.charAt(j)));

      set.add(buffer.toString());
    }

    return set.size();
  }

  public static void main(String[] args) {
    String[] words = { "gin", "zen", "gig", "msg" };

    System.out.println("Unique morse code words in this words array is : " + uniqueCodeWords(words));
  }
}