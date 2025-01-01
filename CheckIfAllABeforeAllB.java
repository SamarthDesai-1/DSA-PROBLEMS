public class CheckIfAllABeforeAllB {

  /** Leetcode 2124 */

  public static boolean checkAllAandB(String s) {
    int i = 0;
    int index = -1;

    while (s.charAt(i) == 'a') 
      index = i++;


    i = index + 1;
    while (i < s.length()) {
      if (s.charAt(i) == 'a')
        return false;

      i++;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "aaaab";

    System.out.println(checkAllAandB(s));

  }
}