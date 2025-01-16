class Array {

  public int Max(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    return max;
  }

  public int Min(int[] nums) {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }

    return min;
  }

}

public class GetMax {

  public static void main(String[] args) {
    int[] nums = { 2, 8, 5, 6, 3, 2, 5, 70 };

    Array foo = new Array();

    System.out.println(foo.Max(nums));
    System.out.println(foo.Min(nums));
  }
}
