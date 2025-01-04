public class AddTwoStrings {

  /**
   * Adds two strings together, interpreting them as numbers. If the strings
   * are different lengths, the extra digits are assumed to be 0.
   *
   * @param one the first string
   * @param two the second string
   */

  public static String solution(String one, String two) {
    StringBuilder sb = new StringBuilder();
    int i = one.length() - 1;
    int j = two.length() - 1;
    int carry = 0;

    char ch = one.length() > two.length() ? 'i' : 'j';

    while ((ch == 'i' ? i : j) >= 0) {
      int digit = carry;

      if (i >= 0)
        digit += one.charAt(i) - '0';

      if (j >= 0)
        digit += two.charAt(j) - '0';

      carry = digit / 10;
      digit %= 10;

      sb.append(digit);
      i--;
      j--;
    }

    if (carry != 0)
      sb.append(carry);

    return sb.reverse().toString();
  }

  /**
   * Main method for the AddTwoStrings class. Used to test the solution method
   * by adding the two strings "894156" and "1" together and printing the
   * result.
   * 
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    String one = "899";
    String two = "1";

    System.out.println("Addition of " + one + " and " + two + " is : " + solution(one, two));
  }
}
