import java.util.ArrayList;

public class PowerOfKSizedSubarray {

  /**
   * Given an array of integers and an integer k, find the k sized subarray power
   * of the array where the difference between adjacent elements is 1 and the
   * elements are in increasing order. If no such subarray exists, add -1 to the
   * list.
   * 
   * @param nums the array of integers
   * @param k    the size of the subarray
   * @return an ArrayList of integers
   */

  public static ArrayList<Integer> powerOfK(int[] nums, int k) {
    int n = nums.length;
    int start = 0;
    int end = 0;
    ArrayList<Integer> list = new ArrayList<>();

    while (end < n) {

      while ((end - start + 1) == k) {

        boolean flag = true;

        for (int i = start; i < end; i++) {
          if ((nums[i + 1] - nums[i]) == 1 && nums[i] < nums[i + 1]) {
            continue;
          } 
          else {
            flag = false;
            list.add(-1);
            break;
          }
        }

        if (flag == true)
          list.add(nums[end]);

        start++;
      }

      end++;
    }

    return list;
  }

  /**
   * A main function to test the above function. It prints
   * the result of calling powerOfK with the given arguments.
   * 
   * @param args the command line arguments.
   */

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3, 2, 3, 2 };
    int k = 2;

    System.out.println(powerOfK(nums, k));
  }
}