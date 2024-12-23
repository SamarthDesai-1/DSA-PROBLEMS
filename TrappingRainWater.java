public class TrappingRainWater {

  /**
   * Given n non-negative integers a1, a2, ..., an , where each represents a point
   * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
   * of the line i is at (i, ai) and (i, 0). Find two lines, which, together with
   * the x-axis forms a container, such that the total area of water it can
   * contain is maximum.
   * 
   * @param nums The input array of integers, where each represents a point at
   *             coordinate (i, ai)
   * @return The total area of water that the two lines and the x-axis can contain
   */
  
  public static int maxTrapWater(int[] nums) {

    int trapWater = 0;
    int maxLeft = 0;
    int maxRight = 0;
    int maxHeight = nums[0];
    int index = 0;

    for (int i = 1; i < nums.length; i++) {

      if (maxHeight < nums[i]) {
        maxHeight = nums[i];
        index = i;
      }
    }

    /** Solve left part */

    for (int i = 0; i < index; i++) {
      if (maxLeft > nums[i])
        trapWater += maxLeft - nums[i];
      else
        maxLeft = nums[i];
    }

    /** Solve right part */

    for (int i = nums.length - 1; i >= index; i--) {
      if (maxRight > nums[i])
        trapWater += maxRight - nums[i];
      else
        maxRight = nums[i];
    }

    return trapWater;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

    System.out.println(maxTrapWater(nums));
  }
}
