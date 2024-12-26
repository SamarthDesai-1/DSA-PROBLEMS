import java.util.*;

public class ThreeSumTwoPointer {

  /**
   * Returns all unique triplets in the given array which sum up to zero.
   * The triplets are sorted in ascending order and the array is sorted in
   * ascending order.
   * Uses a two pointer approach with a hashset to store the solution.
   * 
   * @param nums The array of integers to find the triplets from.
   * @return A list of lists of integers, each sublist being a unique triplet that
   *         sums up to zero.
   */

  public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {

      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {

        ArrayList<Integer> l = new ArrayList<>();
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          l.add(nums[i]);
          l.add(nums[left]);
          l.add(nums[right]);

          set.add(l);
        }

        if (sum < 0)
          left++;
        else
          right--;
      }
    }

    ArrayList<ArrayList<Integer>> output = new ArrayList<>();

    for (ArrayList<Integer> list : set)
      output.add(list);

    return output;
  }

  /**
   * A sample main method to test the threeSum function.
   * Prints the triplets which sum up to zero from the given array.
   * 
   * @param args The command line arguments, ignored in this case.
   */

  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };

    System.out.println("Using two-pointer approach");
    System.out.println("All unique triplets whose sum is zero is : " + threeSum(nums));
  }
}
