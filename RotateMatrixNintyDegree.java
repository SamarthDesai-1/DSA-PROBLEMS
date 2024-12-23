public class RotateMatrixNintyDegree {

  /**
   * Reverse an array of integers in-place
   * 
   * @param x array to reverse
   */

  public static void reverse(int[] x) {
    int start = 0;
    int end = x.length - 1;

    while (start <= end) {
      int cache = x[start];
      x[start] = x[end];
      x[end] = cache;

      start++;
      end--;
    }
  }

  /**
   * Rotate a matrix by 90 degrees clockwise in-place
   * 
   * @param x matrix to rotate
   */

  public static void rotate(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    for (int i = 0; i < row; i++) {

      for (int j = i; j < col; j++) {

        if (i == j)
          continue;

        int cache = x[i][j];
        x[i][j] = x[j][i];
        x[j][i] = cache;
      }

      reverse(x[i]);
    }
  }

  /**
   * Example of rotating a matrix by 90 degrees clockwise in-place
   * 
   * @param args command line arguments
   */
  
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    rotate(matrix);

    for (int[] s : matrix) {
      for (int sDash : s) {
        System.out.print(sDash + " ");
      }
      System.out.println();
    }
  }
}