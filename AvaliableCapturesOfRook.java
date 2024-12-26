public class AvaliableCapturesOfRook {

  /**
   * Return the position of Rook in the given board in the form of array of size
   * two
   * 
   * @param board the given board
   * 
   * @return the position of Rook in the board. If the Rook does not exist, return
   *         {-1, -1}
   */

  public static int[] rookPosition(char[][] board) {
    int row = board.length;
    int col = board[0].length;

    for (int i = 0; i < row; i++)

      for (int j = 0; j < col; j++)

        if (board[i][j] == 'R')
          return new int[] { i, j };

    return new int[] { -1, -1 };
  }

  /**
   * Return the number of pieces that the Rook can capture in the given board.
   * 
   * @param board the given board
   * 
   * @return the number of pieces that the Rook can capture in the given board
   */

  public static int rookCaptures(char[][] board) {
    int totalCapture = 0;

    int row = board.length;
    int col = board[0].length;

    int bishop = 0;
    int pawn = 0;

    int[] position = rookPosition(board);

    /** Process right part */
    for (int i = position[1] + 1; i < col; i++) {

      if (board[position[0]][i] == 'B')
        bishop++;
      else if (board[position[0]][i] == 'p') {
        pawn++;
        break;
      }
    }

    if (bishop == 0 && pawn == 1)
      totalCapture += 1;

    /** reset the bisphop value and pawn value */
    bishop = 0;
    pawn = 0;

    /** Process down part */
    for (int i = position[0] + 1; i < row; i++) {
      if (board[i][position[1]] == 'B')
        bishop++;
      else if (board[i][position[1]] == 'p') {
        pawn++;
        break;
      }
    }

    if (bishop == 0 && pawn == 1)
      totalCapture += 1;

    /** reset the bisphop value and pawn value */
    bishop = 0;
    pawn = 0;

    /** Process left part */
    for (int i = position[1] - 1; i >= 0; i--) {
      if (board[position[0]][i] == 'B')
        bishop++;
      else if (board[position[0]][i] == 'p') {
        pawn++;
        break;
      }
    }

    if (bishop == 0 && pawn == 1)
      totalCapture += 1;

    /** reset the bisphop value and pawn value */
    bishop = 0;
    pawn = 0;

    /** Process upper part */
    for (int i = position[0] - 1; i >= 0; i--) {
      if (board[i][position[1]] == 'B')
        bishop++;
      else if (board[i][position[1]] == 'p') {
        pawn++;
        break;
      }
    }

    if (bishop == 0 && pawn == 1)
      totalCapture += 1;

    return totalCapture;
  }

  /**
   * Test main function.
   *
   * @param args Command line arguments.
   */
  
  public static void main(String[] args) {

    char[][] x = {
        { '.', '.', '.', '.', '.', '.', '.', '.' },
        { '.', '.', '.', 'p', '.', '.', '.', '.' },
        { '.', '.', '.', 'R', '.', '.', '.', 'p' },
        { '.', '.', '.', '.', '.', '.', '.', '.' },
        { '.', '.', '.', '.', '.', '.', '.', '.' },
        { '.', '.', '.', 'p', '.', '.', '.', '.' },
        { '.', '.', '.', '.', '.', '.', '.', '.' },
        { '.', '.', '.', '.', '.', '.', '.', '.' }
    };

    System.out.println("Total captures commited by ROOK will be : " + rookCaptures(x));
  }
}