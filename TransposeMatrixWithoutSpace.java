public class TransposeMatrixWithoutSpace {

  /**
   * Transposes a given matrix in-place. The transpose operation
   * interchanges the row and column indices of the matrix. For example, if a
   * matrix is as follows:
   *
   * 1 2 3 4
   * 5 6 7 8
   * 9 10 11 12
   * 13 14 15 16
   *
   * Then its transpose is as follows:
   *
   * 1 5 9 13
   * 2 6 10 14
   * 3 7 11 15
   * 4 8 12 16
   *
   * @param x the input matrix
   */

  public static void transposeMatrix(int[][] x) {
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
    }
  }

  /**
   * Tests the {@link #transposeMatrix(int[][])} method using the sample
   * matrix provided in the method's docstring.
   */
  
  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
    };

    transposeMatrix(nums);

    for (int[] x : nums) {
      for (int xDash : x)
        System.out.print(xDash + " ");

      System.out.println();
    }
  }
}