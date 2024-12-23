import java.util.*;

public class ReverseString3 {

  /**
   * Reverses each word in a given string.
   *
   * @param s input string
   * @return reversed string
   */

  public static String reverseStringIII(String s) {

    String[] arr = s.split(" ");
    StringBuffer mainBuffer = new StringBuffer("");

    for (int i = 0; i < arr.length; i++) {

      StringBuffer buffer = new StringBuffer(arr[i]);

      int start = 0;
      int end = buffer.length() - 1;

      while (start <= end) {
        char cache = buffer.charAt(end);
        buffer.setCharAt(end, buffer.charAt(start));
        buffer.setCharAt(start, cache);
        start++;
        end--;
      }
      mainBuffer.append(buffer.toString() + " ");
    }

    return mainBuffer.toString().substring(0, mainBuffer.length() - 1);
  }

  /**
   * Test driver for reverseStringIII.
   *
   * @param args command-line arguments
   */
  
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.nextLine();

      System.out.println("Reversed version is : " + reverseStringIII(s));
    }
  }
}
