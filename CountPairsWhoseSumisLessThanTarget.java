public class CountPairsWhoseSumisLessThanTarget {

  /**
   * Counts the number of pairs in the given array whose sum is less than the
   * specified target.
   *
   * @param nums   an array of integers
   * @param target the target sum
   * @return the number of pairs whose sum is less than the target
   */

  public static int countPairs(int[] nums, int target) {
    int count = 0;

    for (int i = 0; i < nums.length; i++)
      for (int j = i + 1; j < nums.length; j++)
        if (nums[i] + nums[j] < target)
          count++;

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 1, 2, 3, 1 };
    int target = 2;

    System.out.println("Count of pairs whose sum is less than " + target + " is : " + countPairs(nums, target));
  }
}