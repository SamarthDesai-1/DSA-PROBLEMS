import java.util.*;

public class TwoSumInput2UsingTwoPointer {

  /**
   * This function takes an array of integers and target as input and finds two
   * elements in the array such that their sum is equal to the target. The
   * function
   * uses two pointer approach to solve the problem in O(n) time complexity. The
   * function returns a Vector of size 2 which contains the indices of the two
   * elements in the array which sum up to the target. If no such pair is found,
   * the
   * function returns an empty Vector.
   */

  public static Vector<Integer> findPairs(int[] nums, int target) {

    Vector<Integer> vector = new Vector<>();

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {

      int sum = nums[left] + nums[right];

      if (sum == target) {
        vector.add(left + 1);
        vector.add(right + 1);
        return vector;
      } else if (sum > target)
        right--;
      else
        left++;
    }

    return vector;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    System.out.println("Target : " + target + ", pairs found at indicies = " + findPairs(nums, target));
  }
}
