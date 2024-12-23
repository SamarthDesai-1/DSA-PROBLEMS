public class RotateMatrixOneEightyDegree {

  static class Matrix {

    /**
     * Reverses the elements of the given array in place.
     *
     * @param x the array to be reversed
     */

    public void reverseRow(int[] x) {
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
     * Reverses the elements of each column of the given matrix in place.
     *
     * @param x the matrix to be reversed
     */

    public void reverseCol(int[][] x) {
      int row = x.length;
      int col = x[0].length;

      for (int i = 0; i < col; i++) {

        int start = 0;
        int end = row - 1;

        while (start <= end) {
          int cache = x[start][i];
          x[start][i] = x[end][i];
          x[end][i] = cache;

          start++;
          end--;
        }
      }
    }

    /**
     * Prints the elements of the given matrix in a row-wise format.
     *
     * @param matrix the 2D array to be printed
     */

    public void print(int[][] matrix) {
      for (int[] x : matrix) {
        for (int xDash : x) {
          System.out.print(xDash + " ");
        }
        System.out.println();
      }
    }
  }

  /**
   * Rotate the given 2D array by 180 degrees in place, then print it out.
   */
  
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

    Matrix foo = new Matrix();
    for (int i = 0; i < matrix.length; i++)
      foo.reverseRow(matrix[i]);

    foo.reverseCol(matrix);

    System.out.println("180 degree rotated matrix.");
    foo.print(matrix);
  }
}