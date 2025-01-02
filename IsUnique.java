public class IsUnique {

  /**
   * Determines if a string has all unique characters.
   *
   * @param s the input string to be checked for uniqueness.
   * @return true if the string contains all unique characters, false otherwise.
   *         If the length of the string exceeds 128, returns false since it
   *         cannot have all unique characters within the ASCII character set.
   */

  public static boolean isUnique(String s) {
    int n = s.length();

    if (n > 128)
      return false;

    boolean[] frequency = new boolean[128];

    for (int i = 0; i < n; i++) {
      int val = s.charAt(i);

      if (frequency[val])
        return false;

      frequency[val] = true;
    }

    return true;
  }

  /**
   * The main function to test the isUnique function.
   * It initializes a test string and prints out whether the string
   * contains all unique characters.
   *
   * @param args command-line arguments (not used).
   */

  public static void main(String[] args) {
    String s = "abCcdeXfghH";

    System.out.println("This string contains all unique characters : " + isUnique(s));
  }
}