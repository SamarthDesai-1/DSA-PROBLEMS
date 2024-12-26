public class SpiralMatrixII {

  /**
   * Generates a two dimensional array filled with numbers from 1 to n*n in a
   * spiral order.
   *
   * @param n the size of the two dimensional array
   * @return a two dimensional array filled with numbers from 1 to n*n in a
   *         spiral order
   */

  public static int[][] spiralMatrix(int n) {
    int row = n;
    int col = n;

    int top = 0;
    int bottom = row - 1;
    int left = 0;
    int right = col - 1;

    int filler = 1;
    int[][] grid = new int[n][n];

    while (top <= bottom && left <= right) {

      for (int i = left; i <= right; i++)
        grid[top][i] = filler++;

      top++;

      for (int i = top; i <= bottom; i++)
        grid[i][right] = filler++;

      right--;

      for (int i = right; i >= left; i--)
        grid[bottom][i] = filler++;

      bottom--;

      for (int i = bottom; i >= top; i--)
        grid[i][left] = filler++;

      left++;
    }

    return grid;
  }

  /**
   * A simple test driver for the spiralMatrix method.
   *
   * @param args unused
   */

  public static void main(String[] args) {
    int n = 4;

    for (int[] x : spiralMatrix(n)) {
      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }
  }
}