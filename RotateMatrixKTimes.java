public class RotateMatrixKTimes {

  /**
   * Reverses the elements of the given array in place.
   *
   * @param x the array of integers to be reversed
   */

  public static void reverseRows(int[] x) {
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
   * Transposes the given matrix in place. The transpose of a matrix is another
   * matrix whose row and column indices have been swapped, i.e. the element at
   * the i-th row and j-th column is the same as the element at the j-th row and
   * the i-th column in the original matrix.
   *
   * @param x the matrix to be transposed
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

      reverseRows(x[i]);
    }
  }

  /**
   * Rotates the given matrix in place by 90 degrees clockwise k times. The
   * rotation is done by transposing the matrix k times.
   *
   * @param x the matrix to be rotated
   * @param k the number of times to rotate the matrix
   */

  public static void rotateKtimes(int[][] x, int k) {
    if (k == 0)
      return;

    while (k-- != 0)
      transposeMatrix(x);

  }

  /**
   * Prints the given matrix to the console. Each row of the matrix is printed
   * on a new line, and the elements of each row are separated by a space.
   * 
   * @param matrix the matrix to be printed
   */

  public static void print(int[][] matrix) {

    for (int[] x : matrix) {
      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }

    System.out.println();
  }

  /**
   * Test program to rotate a matrix by 90 degrees clockwise k times.
   *
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int k = 1;

    rotateKtimes(matrix, k % 4);

    print(matrix);
  }
}