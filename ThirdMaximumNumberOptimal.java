public class ThirdMaximumNumberOptimal {

  /**
   * Given an integer array nums, return the third maximum number in this array.
   * If the array does not contain at least three distinct elements, return the
   * maximum number.
   * 
   * @param nums the input array
   * @return the third maximum number in the array
   */

  public static int thirdMax(int[] nums) {
    int n = nums.length;

    if (n < 3) {

      int max = Integer.MIN_VALUE;
      for (int num : nums) {
        max = Math.max(max, num);
      }
      return max;
    }

    Integer first = null, second = null, third = null;

    for (int num : nums) {
      if ((first != null && num == first) || (second != null && num == second) || (third != null && num == third)) {
        continue;
      }

      if (first == null || num > first) {
        third = second;
        second = first;
        first = num;
      } 
      else if (second == null || num > second) {
        third = second;
        second = num;
      } 
      else if (third == null || num > third) {
        third = num;
      }
    }

    return third == null ? first : third;
  }

  /**
   * This is the main entry point for the program. It tests the thirdMax
   * function with the following array: [1, 2, 2, 3]
   * 
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3 };

    System.out.println("Third maximum number is : " + thirdMax(nums));
  }
}