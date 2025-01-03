import java.util.ArrayList;

public class SortVowelsInAString {

  /**
   * Sorts the vowels in the given string in alphabetical order, while keeping
   * the consonants and their positions unchanged.
   *
   * @param s the input string in which vowels need to be sorted.
   * @return a new string with vowels sorted in alphabetical order.
   */

  public static String sortVowels(String s) {
    int n = s.length();

    String vowelContainer = "aeiouAEIOU";
    StringBuffer sb = new StringBuffer(s);

    ArrayList<Integer> vowelIndexes = new ArrayList<>();
    int[] frequency = new int[128];

    int fLen = frequency.length;

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);

      if (vowelContainer.contains(c + "")) {
        frequency[c]++;
        vowelIndexes.add(i);
      }
    }

    int tracker = 0;
    for (int i = 0; i < fLen; i++) {

      while (tracker < vowelIndexes.size() && frequency[i] != 0) {

        sb.setCharAt(vowelIndexes.get(tracker++), (char) (i));
        frequency[i]--;
      }
    }

    return sb.toString();
  }

  /**
   * The main method serves as the entry point to the program. It initializes a
   * string
   * and calls the sortVowels function to sort the vowels in the string. The
   * result
   * is printed to the console.
   *
   * @param args command-line arguments (not used in this program)
   */

  public static void main(String[] args) {
    String s = "lEetcOde";

    System.out.println("Sorted vowel string is : " + sortVowels(s));
  }
}