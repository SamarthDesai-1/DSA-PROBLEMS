public class FindIndicesWithValueAndIndexDifference {

  /**
   * Finds two indices in the given array such that the difference of the values
   * at the two indices is at least the given value difference and the difference
   * of the indices themselves is at least the given index difference.
   *
   * @param nums      the array of numbers to search
   * @param indexDiff the minimum difference required between the two indices
   * @param valueDiff the minimum difference required between the two values
   * @return an array of two indices that satisfy the given conditions, or {-1,
   *         -1}
   *         if no such pair of indices exists
   */
  
  public static int[] diffs(int[] nums, int indexDiff, int valueDiff) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        int absOfIndex = Math.abs(i - j);
        int absOfValue = Math.abs(nums[i] - nums[j]);

        if (absOfIndex >= indexDiff && absOfValue >= valueDiff)
          return new int[] { i, j };
      }
    }

    return new int[] { -1, -1 };
  }

  /**
   * The main method that demonstrates the usage of the diffs method.
   * It initializes an array and parameters for index and value differences,
   * then prints the indices of the array that satisfy the conditions
   * specified by the diffs method.
   *
   * @param args command line arguments (not used)
   */

  public static void main(String[] args) {
    int[] nums = { 5, 1, 4, 1 };
    int indexDiff = 2;
    int valueDiff = 4;

    for (int x : diffs(nums, indexDiff, valueDiff))
      System.out.print(x + " ");
  }
}