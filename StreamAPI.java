import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI {

  /**
   * Converts a list of strings to uppercase using Stream API.
   *
   * @return a list of uppercase strings
   */

  public static List<String> streamAPIforStrings() {
    List<String> names = Arrays.asList("john, samarth", "james");

    List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

    return upperCaseNames;
  }

  /**
   * Squares each integer in a list using Stream API.
   *
   * @return a list of squared integers
   */

  public static List<Integer> streamAPIforIntegers() {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> squareIntegers = nums.stream().map(n -> n * n).collect(Collectors.toList());

    return squareIntegers;
  }

  /**
   * The main method to test the streamAPIforStrings and streamAPIforIntegers
   * methods.
   *
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {

    System.out.println(streamAPIforStrings());
    System.out.println(streamAPIforIntegers());
  }
}