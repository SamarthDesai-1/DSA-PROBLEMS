public class WaveFormTwoDMatrix {

  /**
   * Prints the elements of the given 2D matrix in a wave like form (column by
   * column). Odd columns are printed from bottom to top, and even columns are
   * printed from top to bottom.
   * 
   * @param x 2D matrix
   */

  public static void printWaveForm(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    for (int j = 0; j < col; j++) {

      if (j % 2 == 0) 
        for (int i = 0; i < row; i++)
          System.out.print(x[i][j] + " ");
          
      else 
        for (int i = row - 1; i >= 0; i--)
          System.out.print(x[i][j] + " ");
    }
  }

  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
    };

    System.out.print("Wave form of this matrix is : ");
    printWaveForm(nums);
  }
}