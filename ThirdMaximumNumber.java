import java.util.*;

public class ThirdMaximumNumber {

  /**
   * Returns the third maximum number in the given array, or the maximum number
   * if there are less than three distinct numbers.
   *
   * @param nums the array of numbers
   * @return the third maximum number
   */

  public static int maxNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int x : nums)
      set.add(x);

    ArrayList<Integer> list = new ArrayList<>();
    for (int x : set)
      list.add(x);

    Collections.sort(list);

    if (list.size() >= 3)
      return list.get(list.size() - 3);

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < list.size(); i++)
      max = Math.max(max, list.get(i));

    return max;
  }

  /**
   * The main method to execute the program, which initializes an array of numbers
   * and prints out the third maximum number using the maxNumber method.
   *
   * @param args command line arguments
   */

  public static void main(String[] args) {
    int[] nums = { -1, -2, -97, -100, -256, -356 };

    System.out.println("Third maximum number is : " + maxNumber(nums));
  }
}