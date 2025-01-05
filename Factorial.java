import java.util.ArrayList;

public class Factorial {

  /**
   * Returns the factorial of n as a string.
   * 
   * This function uses an ArrayList to store the digits of the factorial. It then
   * iterates over the list, multiplying each digit by n and adding the carry, and
   * updating the carry. It then appends the digits in reverse order to a
   * StringBuffer
   * and returns the resulting string.
   * 
   * @param n the number to find the factorial of
   * @return the factorial of n as a string
   */

  public static String fact(int n) {

    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);

    while (n > 1) {

      int carry = 0;
      int size = ans.size();

      for (int i = 0; i < size; i++) {

        int result = ans.get(i) * n + carry;
        carry = result / 10;
        ans.set(i, result % 10);
      }

      while (carry > 0) {
        ans.add(carry % 10);
        carry /= 10;
      }

      n--;
    }

    StringBuffer sb = new StringBuffer("");
    
    for (int i = 0; i < ans.size(); i++)
      sb.append(ans.get(i));

    return sb.reverse().toString();
  }

  /**
   * A test driver for the fact function. Prints the factorial of 8 to the
   * console.
   * 
   * @param args unused
   */

  public static void main(String[] args) {
    int n = 8;

    System.out.println("Factorial of " + n + " is : " + fact(n));
  }
}