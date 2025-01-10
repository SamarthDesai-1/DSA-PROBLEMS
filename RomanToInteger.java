import java.util.*;

public class RomanToInteger {

  /**
   * Converts a Roman numeral string to its integer representation.
   *
   * This method parses the input string representing a Roman numeral and
   * calculates
   * its corresponding integer value. It uses a predefined mapping of Roman
   * numeral
   * characters to their integer values and accounts for subtractive combinations
   * where a smaller numeral precedes a larger one.
   *
   * @param s the Roman numeral string to be converted
   * @return the integer value of the Roman numeral
   */

  public static int toInteger(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int index = 0;
    int n = s.length() - 1;
    int Integer = 0;

    while (index < n) {

      char currentChar = s.charAt(index);
      char nextChar = s.charAt(index + 1);

      if (map.get(currentChar) < map.get(nextChar))
        Integer -= map.get(currentChar);
      else
        Integer += map.get(currentChar);

      index++;
    }

    Integer += map.get(s.charAt(index));

    return Integer;
  }

  /**
   * Example main function to demonstrate the conversion of a Roman numeral to an
   * integer
   * 
   * @param args Command line arguments
   */
  
  public static void main(String[] args) {
    String s = "LX";

    System.out.println("ROMAN " + s + " to INTEGER is : " + toInteger(s));
  }
}