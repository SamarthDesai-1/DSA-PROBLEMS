public class AddTwoStringsEasyVersion {

  /**
   * This function adds two strings which are representations of numbers, and
   * returns the result as a string.
   * The strings are processed from right to left, adding corresponding digits and
   * adding a carry if the sum is greater than 9.
   * The result is stored in a StringBuffer and reversed before being returned as
   * a string.
   * 
   * @param x the first string
   * @param y the second string
   * @return the sum of x and y as a string
   */

  public static String add(String x, String y) {
    int carry = 0;
    StringBuffer sb = new StringBuffer();

    int i = x.length() - 1;
    int j = y.length() - 1;

    while (j >= 0) {

      int sum = y.charAt(j) - '0' + x.charAt(i) - '0' + carry;

      carry = sum / 10;
      sb.append(sum % 10);

      i--;
      j--;
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
   * Test the add function with two strings and print the result.
   * 
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    String x = "11";
    String y = "123";

    if (x.length() < y.length())
      System.out.println("Addition of " + x + " and " + y + " is : " + add(y, x));
    else 
      System.out.println("Addition of " + x + " and " + y + " is : " + add(x, y));
  }
}
