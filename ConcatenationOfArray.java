public class ConcatenationOfArray {

  public static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] result = new int[n * 2];

    for (int i = 0; i < n; i++) {
      result[i] = nums[i];
      result[i + n] = nums[i];
    }

    for (int x : result) System.out.print(x + " ");

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 4 };
    getConcatenation(nums);
  }
}