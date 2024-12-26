public class GameOfLife {

  public static void gameOfLife(int[][] board) {
    if (board == null || board.length == 0)
      return;

    int m = board.length;
    int n = board[0].length;

    int[][] copyBoard = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        copyBoard[i][j] = board[i][j];
      }
    }

    /** Direction array to gey all 8 directions */
    int[] neighbours = { -1, 0, 1 };

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {

        int liveNeighbours = 0;

        /** Check for all neoghbours */
        for (int x : neighbours) {
          for (int y : neighbours) {

            if (!(x == 0 && y == 0)) {
              int r = i + x;
              int c = j + y;

              if ((r >= 0 && r < m) && (c >= 0 && c < n) && copyBoard[r][c] == 1)
                liveNeighbours++;
            }
          }
        }

        if ((copyBoard[i][j] == 1) && (liveNeighbours < 2 || liveNeighbours > 3))
          board[i][j] = 0;
        if ((copyBoard[i][j] == 0) && liveNeighbours == 3)
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