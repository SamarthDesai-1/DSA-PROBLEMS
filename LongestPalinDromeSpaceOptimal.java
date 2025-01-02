public class LongestPalinDromeSpaceOptimal {

  /**
   * Given a string, return the length of the longest palindrome that can be made
   * by rearranging the characters of the string. For example, given the string
   * "abcccddDD", the longest palindrome is "dccd" and the length is 4.
   * 
   * This algorithm runs in O(n) time and uses O(1) space.
   * 
   * @param s the string to process
   * @return the length of the longest palindrome that can be made
   */

  public static int longestPalindrome(String s) {
    int[] frequency = new int[128];

    for (int i = 0; i < s.length(); i++)
      frequency[s.charAt(i)]++;

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

    for (int i = 0; i < s.length(); i++) {
      if (frequency[s.charAt(i)] == 1) {
        palindrome++;
        break;
      }
    }

    return palindrome;
  }

  /**
   * The main method serves as the entry point for the program.
   * It initializes a sample string and computes the length of the longest
   * palindrome that can be formed by rearranging the characters of the string.
   * The result is then printed to the console.
   * 
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {
    String s = "abcccAccTTTdHHd";

    System.out.println("Longest length of palindrom can be made from string " + s + " is : " + longestPalindrome(s));
  }
}