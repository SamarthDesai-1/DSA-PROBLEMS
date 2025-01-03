public class SortVowelsInAStringOptimal {

  /**
   * Sorts the vowels in the given string in ascending order (i.e., a, e, i, o, u)
   * and returns the modified string. Non-vowel characters remain in the same
   * position. The given string is modified in-place.
   * 
   * @param s given string
   * @return modified string
   */

  public static String sortVowels(String s) {
    int n = s.length();

    String vowelContainer = "aeiouAEIOU";
    StringBuffer sb = new StringBuffer(s);

    int[] frequency = new int[128];

    int fLen = frequency.length;

    for (int i = 0; i < n; i++) {
      char c = sb.charAt(i);

      if (vowelContainer.contains(c + "")) {
        frequency[c]++;

        sb.setCharAt(i, '#');
      }
    }

    String sorted = "";
    for (int i = 0; i < fLen; i++) {

      while (frequency[i] != 0) {

        sorted += (char) (i);
        frequency[i]--;
      }
    }

    int first = 0;
    int second = 0;

    while (second < sorted.length()) {

      if (sb.charAt(first) == '#') {
        sb.setCharAt(first, sorted.charAt(second));
        second++;
      }

      first++;
    }

    return sb.toString();
  }

  /**
   * Example main function
   *
   * @param args Command line arguments
   */
  
  public static void main(String[] args) {
    String s = "lEetcOde";

    System.out.println("Sorted vowel string is : " + sortVowels(s));
  }
}