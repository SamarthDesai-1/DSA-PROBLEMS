public class CheckIfAllABeforeAllB {

  /**
   * Checks if all occurrences of 'a' appear before any 'b' in the given string.
   *
   * @param s the input string consisting of characters 'a' and 'b'
   * @return true if all 'a's appear before any 'b', false otherwise
   */

  public static boolean checkAllAandB(String s) {
    int i = 0;
    int index = -1;
    int n = s.length();

    if (n == 1)
      return true;

    while (i < n && s.charAt(i) == 'a')
      index = i++;

    i = index + 1;
    while (i < s.length()) {
      if (s.charAt(i) == 'a')
        return false;

      i++;
    }

    return true;
  }

  /**
   * Example usage of checkAllAandB() function.
   */

  public static void main(String[] args) {
    String s = "aaa";

    System.out.println(checkAllAandB(s));
  }
}