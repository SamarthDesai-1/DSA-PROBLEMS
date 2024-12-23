import java.util.*;

public class SpiralMatrix {

  /**
   * Prints the elements of the given 2D matrix in a spiral form
   * 
   * @param x the given 2D matrix
   * @return the list of elements in spiral order
   */

  public static ArrayList<Integer> printSpiralForm(int[][] x) {
    ArrayList<Integer> ans = new ArrayList<>();

    int row = x.length;
    int col = x[0].length;

    int top = 0;
    int right = col - 1;
    int bottom = row - 1;
    int left = 0;

    top = left = 0;
    right = col - 1;
    bottom = row - 1;

    while (top <= bottom && left <= right) {

      for (int i = left; i <= right; i++)
        ans.add(x[top][i]);

      top++;

      for (int i = top; i <= bottom; i++)
        ans.add(x[i][right]);

      right--;

      if (top <= bottom) {

        for (int i = right; i >= left; i--)
          ans.add(x[bottom][i]);

        bottom--;
      }

      if (left <= right) {

        for (int i = bottom; i >= top; i--)
          ans.add(x[i][left]);

        left++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
    };

    System.out.print("Spiral form of this matrix is : ");
    System.out.println(printSpiralForm(nums));
  }
}