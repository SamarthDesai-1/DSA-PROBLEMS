import java.util.*;

public class WidthOfAColumn {

  /**
   * Counts the number of digits in a given integer.
   *
   * This method counts the number of digits in the given integer. If the integer
   * is negative, it considers the negative sign as an additional character.
   *
   * @param digs The integer whose digits are to be counted.
   * @return The number of digits in the integer, including the negative sign if
   *         applicable.
   */

  public static int countDigits(int digs) {
    int count = 0;

    boolean isNeg = false;
    if (digs < 0) {
      digs = digs * -1;
      isNeg = true;
    }

    while (digs > 0) {
      count++;
      digs /= 10;
    }

    return isNeg == true ? count + 1 : count;
  }

  /**
   * Calculates the width of each column in a 2D grid.
   *
   * This method iterates through each column of the given 2D grid and calculates
   * the maximum width required to display the largest number in that column.
   * The width is determined by the number of digits in the largest number.
   *
   * @param grid The 2D grid represented as an array of arrays of integers.
   * @return An ArrayList containing the width of each column.
   */

  public static ArrayList<Integer> columnWidth(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < col; i++) {
      int max = Integer.MIN_VALUE;

      for (int j = 0; j < row; j++)
        max = Math.max(max, countDigits(grid[j][i]));

      list.add(max);
    }

    return list;
  }

  /**
   * The main method to test the countDigits and columnWidth methods.
   *
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args) {
    int[][] grid = {
        { 1, 23, 456 },
        { 7890, -12, 34 },
        { 56, 789, -1234 },
        { -8556, -855, 25855 }
    };

    System.out.println(columnWidth(grid));
  }
}