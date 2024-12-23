import java.util.*;

public class AddBinaryStrings {

  /**
   * This method takes two binary strings and returns their sum in a binary string
   * form.
   * 
   * @param numOne a binary string
   * @param numTwo a binary string
   * @return a binary string which is the sum of numOne and numTwo
   */

  public static String addBinary(String numOne, String numTwo) {

    int carry = 0;
    StringBuffer buffer = new StringBuffer("");

    /** Logic here */
    int i = numOne.length() - 1;
    int j = numTwo.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {

      int digitOne = i >= 0 ? numOne.charAt(i) - '0' : 0;
      int digitTwo = j >= 0 ? numTwo.charAt(j) - '0' : 0;

      int digit = digitOne + digitTwo + carry;
      carry = digit / 2;
      digit %= 2;

      buffer.append(digit);
      i--;
      j--;
    }

    return buffer.reverse().toString();
  }

  /**
   * This is the main method which takes user input for two binary strings,
   * computes their sum using the addBinary method, and prints the result.
   * 
   * @param args command line arguments
   */

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter number One : ");
      String numOne = input.next();
      System.out.print("Enter number Two : ");
      String numTwo = input.next();

      System.out.println("Addition answer : " + addBinary(numOne, numTwo));
    }
  }
}