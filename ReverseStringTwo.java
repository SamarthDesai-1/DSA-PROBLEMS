/**
 * The ReverseStringTwo class provides a method to reverse a given string.
 */

public class ReverseStringTwo {

  /**
   * Reverses the given string.
   *
   * @param str the string to be reversed
   * @return the reversed string
   */

  public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    int k = str.length();

    int start = 0;
    int end = k - 1;
    while (start <= end) {
      char temp = sb.charAt(end);
      sb.setCharAt(end, sb.charAt(start));
      sb.setCharAt(start, temp);
      start++;
      end--;
    }

    return sb.toString();
  }

  /**
   * The main method to test the reverse method.
   *
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {
    String str = "samarthdesai";

    System.out.println("Reverse of " + str + " is : " + reverse(str));
  }
}