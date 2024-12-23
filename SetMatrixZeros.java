import java.util.*;
import java.util.ArrayList;

public class SetMatrixZeros {

  /**
   * Sets the row and col elements to zeros at the given
   * rowIndex and colIndex.
   *
   * @param x        the matrix to be modified
   * @param rowIndex the row index
   * @param colIndex the column index
   */

  public static void setMatrixZeros(int[][] x, int rowIndex, int colIndex) {
    int row = x.length;
    int col = x[0].length;

    /** Set row elements to zeros */
    for (int i = 0; i < col; i++)
      x[rowIndex][i] = 0;

    /** Set col elements to zeros */
    for (int i = 0; i < row; i++)
      x[i][colIndex] = 0;
  }

  /**
   * Finds the indices in the matrix that are zeros and
   * have their row and col elements set to zeros.
   *
   * @param x   the matrix to be modified
   * @param set the set of indices to have their row
   *            and col elements set to zeros
   */

  public static void findZeros(int[][] x, HashSet<ArrayList<Integer>> set) {
    int row = x.length;
    int col = x[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(j);

        if (x[i][j] == 0 && set.contains(temp))
          setMatrixZeros(x, i, j);

      }
    }
  }

  /**
   * Finds the indices in the matrix that are zeros and
   * have their row and col elements set to zeros.
   *
   * @param x the matrix to be modified
   */

  public static void zeros(int[][] x) {
    HashSet<ArrayList<Integer>> set = new HashSet<>();

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        if (x[i][j] == 0) {
          ArrayList<Integer> cache = new ArrayList<>();
          cache.add(i);
          cache.add(j);

          set.add(cache);
        }
      }
    }

    findZeros(x, set);
  }

  /**
   * Prints the matrix. The matrix has been set to zeros using the
   * zeros function.
   *
   * @param matrix the matrix to be printed
   */

  public static void print(int[][] matrix) {
    System.out.println("Set matrix to zeros.");

    for (int[] x : matrix) {
      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }
  }

  /**
   * Example usage of the SetMatrixZeros class.
   *
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

    zeros(matrix);
    print(matrix);
  }
}