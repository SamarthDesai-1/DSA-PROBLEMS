import java.util.*;

public class UniqueMorseCodeWords {

  public static String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
      "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

  /**
   * This function takes an array of words and then converts them all into their
   * morse code equivalents.
   * It then returns the number of unique morse code words present in the array.
   * 
   * @param words the array of words to be converted into morse code and then
   *              checked for uniqueness.
   * @return the number of unique morse code words present in the array.
   */
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

  /**
   * This is the main function which is the entry point for the program.
   * It simply takes an array of words and prints the number of unique morse
   * code words present in the array.
   * 
   * @param args the command line arguments that are passed when the program is
   *             executed.
   */

  public static void main(String[] args) {
    String[] words = { "gin", "zen", "gig", "msg" };

    System.out.println("Unique morse code words in this words array is : " + uniqueCodeWords(words));
  }
}