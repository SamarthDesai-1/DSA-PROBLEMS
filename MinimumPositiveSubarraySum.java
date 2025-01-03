public class MinimumPositiveSubarraySum {

  /**
   * Returns the minimum sum of a subarray of size between l and r from the given
   * array
   * that is positive. If no such subarray exists, returns -1.
   *
   * @param nums the given array
   * @param l    the lower bound of the size of the subarray
   * @param r    the upper bound of the size of the subarray
   * 
   * @return the minimum positive sum of a subarray of size between l and r, or -1
   * 
   */

  public static int minimumPositiveSubarray(int[] nums, int l, int r) {
    int min = Integer.MAX_VALUE;

    for (int i = l; i <= r; i++) {

      int start = 0;
      int end = 0;
      int sum = 0;
      int minSum = Integer.MAX_VALUE;

      while (end < nums.length) {
        sum += nums[end];

        while ((end - start + 1) == i) {
          if (sum > 0)
            minSum = Math.min(sum, minSum);

          sum -= nums[start++];
        }

        end++;
      }

      min = Math.min(min, minSum);
    }

    return min == Integer.MAX_VALUE ? -1 : min;
  }

  /**
   * Unit test for the minimumPositiveSubarray method
   * 
   * @param args command line arguments
   */
  
  public static void main(String[] args) {
    int[] nums = { -2, 2, -3, 1 };
    int l = 2;
    int r = 3;

    System.out.println(minimumPositiveSubarray(nums, l, r));
  }
}
