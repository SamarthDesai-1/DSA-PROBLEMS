public class CheckPermutation {

  /**
   * Checks if two strings are permutations of each other.
   * 
   * @param x
   *          the first string
   * @param y
   *          the second string
   * @return true if the strings are permutations of each other, false otherwise
   */
  
  public static boolean isPermutation(String x, String y) {

    if (x.length() != y.length())
      return false;

    int[] frequency = new int[128];

    for (int i = 0; i < y.length(); i++)
      frequency[y.charAt(i)]++;

    for (int i = 0; i < x.length(); i++) {
      frequency[x.charAt(i)]--;

      if (frequency[x.charAt(i)] < 0)
        return false;
    }

    return true;
  }

  /**
   * The main method to test the isPermutation function.
   * It checks if the two predefined strings x and y are permutations of each
   * other
   * and prints the result to the console.
   * 
   * @param args
   *             command line arguments
   */

  public static void main(String[] args) {
    String x = "abcc";
    String y = "cbaa";

    System.out.println(x + " is a permutation of " + y + " : " + isPermutation(x, y));
  }
}
