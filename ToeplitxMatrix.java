public class ToeplitxMatrix {

  public static boolean isToeplitz(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;

    final int starters = 1;

    if (row == starters || col == starters) 
      return true;

    for (int i = starters; i < row; i++) {

      for (int j = starters; j < col; j++) {
        if (grid[i][j] != grid[i - 1][j - 1]) 
          return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 11, 74, 0, 93 }, { 40, 11, 74, 7 } };

    System.out.println("Is matrix is toeplitz : " + isToeplitz(matrix));
  }
}