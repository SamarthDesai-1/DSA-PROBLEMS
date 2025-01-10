public class EvenAndOddNumbers {

  /**
   * Returns whether the last digit of the given number is even or odd.
   * 
   * @param n the number to check
   * @return "Even" if the last digit of n is even, "Odd" otherwise
   */

  public static String oddEven(String n) {
    int lastDigit = (n.charAt(n.length() - 1) - '0') % 10;

    return lastDigit % 2 == 0 ? "Even Number" : "Odd Number";
  }

  /**
   * Example usage of the oddEven method.
   * 
   * @param args unused
   */

  public static void main(String[] args) {
    String n = "78456123087456";

    System.out.println(n + " is : " + oddEven(n));
  }
}