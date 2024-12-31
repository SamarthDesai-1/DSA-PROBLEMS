public class MaximumLengthOfSubstringWithTwoOccurrences {

  /**
   * Calculates and prints the maximum length of a substring in which each
   * character
   * can appear at most twice. It uses a sliding window approach to identify
   * the longest valid substring in the given string.
   *
   * @param s The input string in which the maximum length of the substring is to
   *          be found.
   */

  public static void maxLength(String s) {

    int maxLength = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    int[] count = new int[26];

    @SuppressWarnings("unused")
    int distinctCharacters = 0;

    for (int i = 0; i < s.length(); i++) {
      if (count[s.charAt(i) - 'a'] == 0)
        distinctCharacters++;
    }

    while (end < s.length()) {
      if (count[s.charAt(end) - 'a'] == 0)
        distinctCharacters--;

      count[s.charAt(end) - 'a']++;

      while (count[s.charAt(end) - 'a'] > 2) {
        count[s.charAt(start) - 'a']--;

        if (count[s.charAt(start) - 'a'] == 0)
          distinctCharacters++;

        start++;
      }

      maxLength = Math.max(maxLength, end - start + 1);
      end++;
    }

    System.out.println(maxLength);
  }

  /**
   * The main method serves as the entry point for the application. It initializes
   * the input string and invokes the maxLength function to calculate and print
   * the maximum length of a substring in which each character can appear at most
   * twice.
   *
   * @param args Command line arguments (not utilized in this implementation).
   */

  public static void main(String[] args) {
    String s = "abcxyxxy";

    maxLength(s);
  }

}
