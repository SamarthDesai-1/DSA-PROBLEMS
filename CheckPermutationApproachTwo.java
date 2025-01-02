public class CheckPermutationApproachTwo {

  /**
   * Sorts the characters in the given string in ascending order.
   * 
   * @param x the input string to be sorted
   * @return a new string with characters sorted in ascending order
   */

  static String sortStr(String x) {
    char[] content = x.toCharArray();
    java.util.Arrays.sort(content);

    return new String(content);
  }

  /**
   * Checks if the given two strings are permutations of each other.
   * Two strings are permutations of each other if they have the same
   * characters, only the order of characters can be different.
   *
   * @param x the first input string
   * @param y the second input string
   * @return true if the given two strings are permutations of each
   *         other, false otherwise
   */

  public static boolean isPermutation(String x, String y) {

    if (x.length() != y.length())
      return false;

    return sortStr(x).equals(sortStr(y));
  }

  /**
   * Tests the isPermutation function with a sample input.
   * The main function is the entry point of the program.
   * 
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    String x = "abc";
    String y = "cba";

    System.out.println(x + " is a permutation of " + y + " : " + isPermutation(x, y));
  }
}