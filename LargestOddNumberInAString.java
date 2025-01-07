public class LargestOddNumberInAString {

  /**
   * Given a string containing only digits, returns the largest odd number that
   * can be formed using the given digits.
   *
   * @param num A string containing only digits.
   * @return The largest odd number that can be formed using the given digits.
   */

  public static String largestOdd(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {

      if (Character.getNumericValue(num.charAt(i)) % 2 != 0)
        return num.substring(0, i + 1);
    }

    return "";
  }

  /**
   * Main function to test the largestOdd function.
   * 
   * @param args Unused.
   */
  
  public static void main(String[] args) {
    String num = "52";

    System.out.println(largestOdd(num));
  }
}