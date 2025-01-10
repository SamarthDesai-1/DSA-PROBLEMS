public class ThirdMaximumNumberOptimal {


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

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3 };

    System.out.println("Third maximum number is : " + thirdMax(nums));
  }
}