public class MinimumPositiveSubarraySum {

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

  public static void main(String[] args) {
    int[] nums = { -2, 2, -3, 1 };
    int l = 2;
    int r = 3;

    System.out.println(minimumPositiveSubarray(nums, l, r));
  }
}
