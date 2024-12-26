public class ReverseNintyDegreeAntiClockwise {

  /**
   * Transpose a matrix.
   *
   * @param x the matrix to transpose
   */

  public static void transpose(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    for (int i = 0; i < row - 1; i++) {

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
   * Reverse each column in a matrix.
   *
   * @param x the matrix whose columns are to be reversed
   */

  public static void reverseColumns(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    for (int j = 0; j < col; j++) {

      int start = 0;
      int end = row - 1;

      while (start <= end) {
        int cache = x[start][j];
        x[start][j] = x[end][j];
        x[end][j] = cache;

        start++;
        end--;
      }
    }
  }

  /**
   * Prints the elements of a matrix to the console with each row of the
   * matrix on a separate line, and with each element of the matrix separated
   * by a space. A newline is printed after printing all elements of the
   * matrix.
   *
   * @param matrix the matrix whose elements are to be printed
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
   * Rotate a matrix by 90 degrees in an anti-clockwise direction in-place
   * using transpose and reverse column operations.
   *
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    transpose(matrix);
    reverseColumns(matrix);
    print(matrix);
  }
}
