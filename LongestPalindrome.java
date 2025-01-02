public class LongestPalindrome {

  public static boolean flag = true;

  /**
   * Computes the longest possible length of a palindrome that can be built
   * using the lowercase letters from the given string.
   *
   * This function calculates the frequency of each lowercase letter in the
   * input string `s`, and uses these frequencies to determine the maximum
   * palindrome length that can be constructed. Each pair of identical letters
   * can be used to extend the palindrome, and at most one unmatched letter can
   * be used in the center of the palindrome.
   *
   * @param s     The input string containing lowercase letters.
   * @param caser A character parameter that is not used in the current
   *              implementation.
   * @return The length of the longest palindrome that can be constructed from the
   *         input string's lowercase letters.
   */

  public static int longestPalindromeForLowerCase(String s) {
    int[] frequency = new int[26];
    int n = frequency.length;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
        frequency[s.charAt(i) - 'a']++;
    }

    int palindrome = 0;

    for (int i = 0; i < n; i++) {

      if (frequency[i] % 2 == 0) {
        palindrome += frequency[i];
        frequency[i] = 0;
      } 
      else {
        palindrome += frequency[i] - 1;
        frequency[i] = 1;
      }
    }

    for (int i = 0; i < n; i++) {

      if (flag == true && frequency[i] == 1) {
        palindrome++;
        flag = false;
        break;
      }
    }

    return palindrome;
  }

  /**
   * Calculates the length of the longest palindrome that can be constructed
   * using the uppercase letters in the input string.
   *
   * @param s The input string consisting of uppercase letters.
   * @return The length of the longest palindrome that can be constructed from
   *         the uppercase letters in the input string.
   */

  public static int longestPalindromeForUpperCase(String s) {
    int[] frequency = new int[26];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        frequency[s.charAt(i) - 'A']++;
    }

    int palindrome = 0;

    for (int i = 0; i < frequency.length; i++) {
      if (frequency[i] % 2 == 0) {
        palindrome += frequency[i];
        frequency[i] = 0;
      } 
      else {
        palindrome += frequency[i] - 1;
        frequency[i] = 1;
      }
    }

    for (int i = 0; i < frequency.length; i++) {

      if (flag == true && frequency[i] == 1) {
        palindrome++;
        flag = false;
        break;
      }
    }

    return palindrome;
  }

  /**
   * The main method serves as the entry point for the application, which
   * computes and prints the longest possible length of a palindrome that
   * can be formed using both lowercase and uppercase letters from the given
   * input string `s`. It invokes the methods to compute the palindrome length
   * separately for lowercase and uppercase characters and then outputs the
   * total palindrome length.
   *
   * @param args Command line arguments (not used in this program).
   */

  public static void main(String[] args) {
    String s = "abccccddDD";

    int fromLower = longestPalindromeForLowerCase(s);
    int fromupper = longestPalindromeForUpperCase(s);

    System.out.println("Longest palindrom length is : " + (fromLower +
        fromupper));
  }
}