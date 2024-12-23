public class MatrixDiagonalSum {

  /**
   * Computes the sum of the left diagonal elements of a square matrix.
   *
   * @param x a 2D array representing a square matrix
   * @return the sum of the left diagonal elements of the matrix
   */

  public static int leftDiagonalSum(int[][] x) {
    int sum = 0;
    int row = x.length;

    for (int i = 0; i < row; i++)
      sum += x[i][i];

    return sum;
  }

  /**
   * Computes the sum of the right diagonal elements of a square matrix.
   * 
   * @param x    a 2D array representing a square matrix
   * @param flag a character indicating whether to exclude the central element
   *             when the matrix has an odd size ('f' for exclude, 't' for
   *             include)
   * @return the sum of the right diagonal elements of the matrix
   */

  public static int rightDiagonalSum(int[][] x, char flag) {
    int sum = 0;
    int row = x.length;
    int col = x[0].length - 1;

    for (int i = 0; i < row; i++) {

      if (flag == 'f' && i == col) {
        col--;
        continue;
      }

      sum += x[i][col--];
    }

    return sum;
  }

  /**
   * Computes the sum of the left and right diagonal elements of a square matrix.
   * If the matrix has an odd size, the central element is excluded from the sum.
   * 
   * @param x a 2D array representing a square matrix
   * @return the sum of the left and right diagonal elements of the matrix
   */

  public static int diagonalSum(int[][] x) {
    int row = x.length;

    if (row % 2 == 0)
      return leftDiagonalSum(x) + rightDiagonalSum(x, 't');

    return leftDiagonalSum(x) + rightDiagonalSum(x, 'f');
  }

  /**
   * Test the matrix diagonal sum methods with a 3x3 matrix.
   */
  
  public static void main(String[] args) {
    int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println("Diagonal sum of matrix is : " + diagonalSum(nums));
  }
}