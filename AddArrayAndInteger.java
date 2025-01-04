public class AddArrayAndInteger {

  /**
   * Converts an array of integers or an integer into a string
   *
   * @param n    an array of integers
   * @param k    an integer
   * @param flag a char 'f' for array and 's' for integer
   * @return a string representation of the array or integer
   */

  public static String toStr(int[] n, int k, char flag) {
    StringBuffer sb = new StringBuffer();

    if (flag == 'f') {
      for (int i = 0; i < n.length; i++)
        sb.append(n[i]);

      return sb.toString();
    } 
    else {

      while (k > 0) {
        sb.append(k % 10);
        k /= 10;
      }
    }

    return sb.reverse().toString();
  }

  /**
   * Adds two strings together and returns the result as a string.
   * This method assumes that the strings are representing numbers and
   * that the numbers are not negative.
   *
   * @param x the first string number
   * @param y the second string number
   * @return the sum of the two string numbers as a string
   */

  public static String add(String x, String y) {
    StringBuffer sb = new StringBuffer();

    int carry = 0;
    int i = x.length() - 1;
    int j = y.length() - 1;

    while (j >= 0) {
      int sum = y.charAt(j) - '0' + x.charAt(i) - '0' + carry;

      carry = sum / 10;
      sb.append(sum % 10);

      j--;
      i--;
    }

    while (i >= 0) {
      int sum = x.charAt(i) - '0' + carry;

      carry = sum / 10;
      sb.append(sum % 10);

      i--;
    }

    if (carry != 0)
      sb.append(carry);

    return sb.reverse().toString();
  }

  /**
   * Main method to call the above methods to add two strings together and to
   * convert an array and an integer into strings. The strings are then added
   * together by calling the add method and the result is then printed out to
   * the console.
   */

  public static void main(String[] args) {
    /** Convert both array and k into string for easy calculation */
    int[] nums = { 7, 1, 2, 5, 3 };
    int k = 862;

    String x = toStr(nums, k, 'f');
    String y = toStr(null, k, 't');

    if (x.length() < y.length())
      System.out.println("Addition of " + x + " and " + y + " is : " + add(y, x));
    else
      System.out.println("Addition of " + x + " and " + y + " is : " + add(x, y));
  }
}
