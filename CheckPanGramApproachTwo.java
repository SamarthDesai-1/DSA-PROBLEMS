public class CheckPanGramApproachTwo {

  /**
   * Returns true if the given string is a pangram, i.e. it contains all
   * the letters of the alphabet at least once.
   *
   * The string is case-insensitive, i.e. 'A' and 'a' are considered the same.
   *
   * This method has a time complexity of O(n), where n is the length of the
   * string, and a space complexity of O(1) since it only uses a fixed-size
   * array of length 26.
   */

  public static boolean isPangram(String s) {
    int[] alphabet = new int[26];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ')
        alphabet[s.charAt(i) - 'a'] = 1;
    }

    for (int z : alphabet)
      if (z == 0)
        return false;

    return true;
  }

  /**
   * Test program to check if the given string is a pangram or not
   * 
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog";

    System.out.println("Is this a pangram string : " + isPangram(s));

  }
}