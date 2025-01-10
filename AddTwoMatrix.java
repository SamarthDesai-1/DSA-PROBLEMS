public class AddTwoMatrix {

  /**
   * Adds two matrices, x and y, and returns the result.
   * The matrices must be the same size, i.e., have the same number of rows and
   * columns.
   * 
   * @param x the first matrix
   * @param y the second matrix
   * @return the sum of x and y
   */
  
  public static int[][] addMatrix(int[][] x, int[][] y) {
    int row = x.length;
    int col = x[0].length;

    int[][] sum = new int[row][col];

    for (int i = 0; i < row; i++)
      for (int j = 0; j < col; j++)
        sum[i][j] = x[i][j] + y[i][j];

    return sum;
  }

  public static void main(String[] args) {
    int[][] x = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] y = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    for (int[] i : addMatrix(x, y)) {
      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
