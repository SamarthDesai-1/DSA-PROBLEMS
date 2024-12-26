public class TransposeMatrix {

  /**
   * Returns the transpose of the given matrix.
   * 
   * @param x Input matrix
   * @return Transpose of the matrix
   */

  public static int[][] transposematrix(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    int[][] transpose = new int[col][row];

    for (int i = 0; i < row; i++)

      for (int j = 0; j < col; j++)

        transpose[i][j] = x[i][j];

    return transpose;
  }

  /**
   * Test the transposematrix function. The following matrix is transposed
   *
   * 1 2 3 4
   * 5 6 7 8
   * 9 10 11 12
   * 13 14 15 16
   *
   * to
   *
   * 1 5 9 13
   * 2 6 10 14
   * 3 7 11 15
   * 4 8 12 16
   */

  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
    };

    for (int[] x : transposematrix(nums)) {

      for (int xDash : x)
        System.out.print(xDash + " ");

      System.out.println();
    }
  }
}