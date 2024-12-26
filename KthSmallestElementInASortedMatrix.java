import java.util.*;

public class KthSmallestElementInASortedMatrix {

  /**
   * Finds the kth smallest element in a sorted matrix.
   *
   * This method flattens a 2D matrix into a 1D array, sorts it, and returns
   * the element at index k-1, effectively finding the kth smallest element
   * in the matrix.
   *
   * @param x The 2D matrix represented as an array of arrays, where each
   *          row is sorted in non-decreasing order.
   * @param k The order of the smallest element to find.
   * @return The kth smallest element in the matrix.
   */

  public static int kthSmallestElement(int[][] x, int k) {
    int[] nums = new int[(int) Math.pow(x.length, 2)];

    int filler = 0;
    for (int i = 0; i < x.length; i++) {

      for (int j = 0; j < x[0].length; j++)
        nums[filler++] = x[i][j];

    }

    Arrays.sort(nums);

    return nums[k - 1];
  }

  /**
   * Tests the kthSmallestElement method.
   *
   * Given a matrix and the value of k, this method will find the kth smallest
   * element in the matrix.
   */

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 5, 6 }, { 10, 11, 13 }, { 12, 13, 15 }
    };
    int k = 8;

    System.out.println("NOTE : This is a brute force solution.");
    System.out.println("Kth smallest element in a mtrix is : " + kthSmallestElement(matrix, k));
  }
}