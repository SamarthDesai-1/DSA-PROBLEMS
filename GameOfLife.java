public class GameOfLife {

  /**
   * Simulates one iteration of the Game of Life on a given board.
   *
   * The Game of Life is a cellular automaton devised by John Conway. The board
   * is a grid of cells, where each cell can be either alive (1) or dead (0).
   * Each cell interacts with its eight neighbors, which are the cells that are
   * horizontally, vertically, or diagonally adjacent.
   *
   * - Any live cell with fewer than two live neighbors dies, as if by
   * underpopulation.
   * - Any live cell with two or three live neighbors lives on to the next
   * generation.
   * - Any live cell with more than three live neighbors dies, as if by
   * overpopulation.
   * - Any dead cell with exactly three live neighbors becomes a live cell, as if
   * by reproduction.
   *
   * @param board the 2D array representing the board, where '1' represents a live
   *              cell
   *              and '0' represents a dead cell. The board is updated in place.
   */

  public static void gameOfLife(int[][] board) {
    int row = board.length;
    int col = board[0].length;

    if (board == null || row == 0)
      return;

    int[][] copyBoard = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        copyBoard[i][j] = board[i][j];
      }
    }

    int[] neighbours = { -1, 0, 1 };

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {

        int livingNeighbours = 0;

        for (int x : neighbours) {
          for (int y : neighbours) {
            if (!(x == 0 && y == 0)) {
              int r = i + x;
              int c = j + y;

              if ((r >= 0 && r < row) && (c >= 0 && c < col) && copyBoard[r][c] == 1)
                livingNeighbours++;
            }
          }
        }

        if ((board[i][j] == 1) && livingNeighbours < 2 || livingNeighbours > 3)
          board[i][j] = 0;
        if ((board[i][j] == 0) && livingNeighbours == 3)
          board[i][j] = 1;
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 0, 1, 0 },
        { 0, 0, 1 },
        { 1, 1, 1 },
        { 0, 0, 0 }
    };

    gameOfLife(matrix);

    for (int[] x : matrix) {
      for (int xDash : x) {
        System.out.print(xDash + " ");
      }
      System.out.println();
    }
  }
}