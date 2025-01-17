import java.util.ArrayList;

public class PlusMinus {

  /**
   * Calculates the ratios of positive, negative, and zero elements in an array.
   *
   * This method iterates through the given array, counts the number of positive,
   * negative, and zero elements, and then calculates their respective ratios.
   *
   * @param nums The array of integers to be analyzed.
   * @return An ArrayList containing three Double values:
   *         - The ratio of positive numbers
   *         - The ratio of negative numbers
   *         - The ratio of zeros
   */

  public static ArrayList<Double> plusMinus(int[] nums) {
    ArrayList<Double> ratios = new ArrayList<>();
    int n = nums.length;

    double negativeCount = 0;
    double positiveCount = 0;
    double zeros = 0;

    for (int i = 0; i < n; i++) {
      if (nums[i] == 0)
        zeros++;
      else if (nums[i] < 0)
        negativeCount++;
      else
        positiveCount++;
    }

    ratios.add(positiveCount / nums.length);
    ratios.add(negativeCount / nums.length);
    ratios.add(zeros / nums.length);

    return ratios;
  }

  /**
   * The main method to test the plusMinus method.
   *
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {
    int[] nums = { 1, 58, 2, 6, 8, -5, -2, 55, -7, -5, -5, -6, -6, 0, 0, 0, 0, 0, 85, -85, -32, 8, 2, 85, 3, -25 };

    System.out.println(plusMinus(nums));
  }
}