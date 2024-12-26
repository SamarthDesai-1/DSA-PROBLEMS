import java.util.*;
import java.util.ArrayList;

public class FourSum {

  public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) { 

    HashSet<ArrayList<Integer>> set = new HashSet<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i + 1; j < nums.length; j++) {
        
        int left = j + 1;
        int right = nums.length - 1;

        while (left < right) {

          ArrayList<Integer> l = new ArrayList<>();
          long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];

          if (sum == target) {
            l.add(nums[i]);
            l.add(nums[j]);
            l.add(nums[left]);
            l.add(nums[right]);

            set.add(l);
          }
          
          if (sum < target) 
            left++;
          else 
            right--;
        }
      }
    }

    ArrayList<ArrayList<Integer>> output = new ArrayList<>();
    for (ArrayList<Integer> list : set)
      output.add(list);

    return output;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 0, -1, 0, -2, 2 };
    int target = 0;

    System.out.println("All unique quadraplets whose sum is equal to " + target + " is : " + fourSum(nums, target));
  }
}
