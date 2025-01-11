public class FindIndicesWithValueAndIndexDifference {

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

  public static void main(String[] args) {
    int[] nums = { 5, 1, 4, 1 };
    int indexDiff = 2;
    int valueDiff = 4;

    for (int x : diffs(nums, indexDiff, valueDiff))
      System.out.print(x + " ");
  }
}