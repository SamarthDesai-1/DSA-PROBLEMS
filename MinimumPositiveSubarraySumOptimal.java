public class MinimumPositiveSubarraySumOptimal {

  public static int minimumPositiveSubarray(int[] nums, int l, int r) {
    int min = Integer.MAX_VALUE;
    int n = nums.length;

    for (int size = l; size <= r; size++) {
      int sum = 0;

      for (int i = 0; i < size; i++) 
        sum += nums[i];

      if (sum > 0)
        min = Math.min(min, sum);

      for (int i = size; i < n; i++) {
        sum += nums[i] - nums[i - size];
        if (sum > 0)
          min = Math.min(min, sum);
      }
    }

    return min == Integer.MAX_VALUE ? -1 : min;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    int l = 2;
    int r = 4;

    System.out.println(minimumPositiveSubarray(nums, l, r));
  }
}