public class GetMax {

  public static void getMax(int[] nums) {
    int max = Integer.MIN_VALUE;
    int index = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        index = i;
      }
    }

    System.out.println(max);
    System.out.println(index);
  }

  public static void main(String[] args) {
    int[] nums = { 2, 8, 5, 6, 3, 2, 5, 70 };

    getMax(nums);

  }
}
