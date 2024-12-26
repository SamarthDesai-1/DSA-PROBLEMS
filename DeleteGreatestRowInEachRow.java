public class DeleteGreatestRowInEachRow {

  /**
   * Computes the sum of the greatest values from each row of a 2D array.
   * It iteratively finds the maximum element of each row, marks it as visited
   * by setting its value to -1, and decrements the total number of elements.
   * The process is repeated until all elements are visited, and the sum of
   * all row-wise maxima is returned.
   *
   * @param x a 2D integer array representing the matrix.
   * @return the sum of the greatest values from each row until all elements are
   *         visited.
   */

  public static int greatestValue(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    int totalElems = row * col;
    int sum = 0;

    while (totalElems != 0) {

      int overallMax = Integer.MIN_VALUE;
      for (int i = 0; i < row; i++) {

        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colIndex = -1;

        for (int j = 0; j < col; j++) {
          if (max < x[i][j]) {
            max = x[i][j];
            rowIndex = i;
            colIndex = j;
          }
        }

        x[rowIndex][colIndex] = -1;
        totalElems--;

        overallMax = Math.max(max, overallMax);
      }

      sum += overallMax;
    }

    return sum;
  }

  /**
   * Test case for the greatestValue() function. Prints the sum of the row-wise
   * maximum elements of a 2D array, and then prints the 2D array with the
   * maximum elements of each row set to -1.
   */

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println("Sum : " + greatestValue(matrix));

    for (int[] x : matrix) {
      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }
  }
}