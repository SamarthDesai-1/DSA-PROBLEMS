import java.util.*;

public class RomanToInteger {

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

  public static void main(String[] args) {
    String s = "LX";

    System.out.println("ROMAN " + s + " to INTEGER is : " + toInteger(s));
  }
}