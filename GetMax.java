class Array {

/**
 * Finds the maximum value in an integer array.
 *
 * @param nums the array of integers to be evaluated
 * @return the maximum integer value found in the array
 */

  public int Max(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    return max;
  }

  /**
   * Finds the minimum value in an integer array.
   *
   * @param nums the array of integers to be evaluated
   * @return the minimum integer value found in the array
   */

  public int Min(int[] nums) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }

    return min;
  }

}

public class GetMax {

  /**
   * Test driver for Array class
   *
   * Demonstrates basic functionality of Array class
   * by creating an instance and calling its Max and Min methods
   * on a sample array.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    int[] nums = { 2, 8, 5, 6, 3, 2, 5, 70 };

    Array foo = new Array();

    System.out.println(foo.Max(nums));
    System.out.println(foo.Min(nums));
  }
}
