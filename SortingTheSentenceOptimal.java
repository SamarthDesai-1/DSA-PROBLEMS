public class SortingTheSentenceOptimal {

  /**
   * Counts the number of white spaces in the given string s.
   * 
   * @param s the given string
   * @return the number of white spaces in the given string
   */
  
  public static int whiteSpaces(String s) {
    int spaces = 0;

    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) == ' ')
        spaces++;

    return spaces;
  }

  /**
   * Sorts a sentence based on the numerical suffix of each word.
   *
   * This method takes a sentence where each word is suffixed by a number
   * indicating its order in the sorted sentence. It extracts and sorts the
   * words according to these suffix numbers, then returns the sorted sentence
   * without the numbers.
   *
   * @param s the input sentence where each word ends with a digit representing
   *          its position in the sorted sentence
   * @return the sorted sentence with words in correct order and without numerical
   *         suffixes
   */

  public static String sortSentence(String s) {
    int spaces = whiteSpaces(s);
    String[] sorted = new String[spaces + 1];

    StringBuffer ans = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      StringBuffer sb = new StringBuffer();

      int idx = i;

      while (idx < s.length() && s.charAt(idx) != ' ') {
        sb.append(s.charAt(idx++));
      }

      int num = sb.charAt(sb.length() - 1) - '0';
      sorted[num - 1] = sb.toString().substring(0, sb.length() - 1);

      i = idx;
    }

    for (String x : sorted)
      ans.append(x).append(" ");

    return ans.toString();
  }

  /**
   * Tests the {@link #sortSentence(String)} method by sorting the sentence
   * "this1 is3 a4 sentence2 correct5" and printing the sorted sentence to
   * standard output.
   */

  public static void main(String[] args) {
    String s = "this1 is3 a4 sentence2 correct5";

    System.out.println("Sorted order : " + sortSentence(s));
  }
}
