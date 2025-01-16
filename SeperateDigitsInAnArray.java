import java.util.ArrayList;

public interface SeperateDigitsInAnArray {

  public static int reverseDigit(int n) {
    int reversed = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      reversed = reversed * 10 + lastDigit;

      n /= 10;
    }

    return reversed;
  }

  public static ArrayList<Integer> seperateDigits(int[] nums) {
    ArrayList<Integer> seperatedDigits = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int val = nums[i];

      while (val > 0) {
        seperatedDigits.add(val % 10);
        val /= 10;

      }


    }

    return seperatedDigits;
  }

  public static void main(String[] args) {
    int[] nums = { 7777, 299, 22, 3 };

    for (int i = 0; i < nums.length; i++) {
      nums[i] = reverseDigit(nums[i]);
    }

    System.out.println(seperateDigits(nums));
  }
}
