public class ReverseColumns {

  /**
   * Reverse each column of the given matrix x.
   * 
   * @param x the given matrix
   */

  public static void reverseColumns(int[][] x) {
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
   * Main entry of the program. Reverses the columns of a sample matrix and prints
   * the result.
   * 
   * @param args command line arguments
   */

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    reverseColumns(matrix);

    for (int[] x : matrix) {

      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }
  }
}
