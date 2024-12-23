public class TicTacToe {

  public static String scanLeftDiagonal(char[][] grid) {
    int row = grid.length;

    int count = 0;
    for (int i = 0; i < row; i++) 
      if (grid[i][i] == 'x')
        count++;

    return count == 3 ? "Player : 1" : "Player : 2";
  }

  public static String scanRightDiagonal(char[][] grid) {
    int row = grid.length;
    int col = grid[0].length - 1;

    int count = 0;
    for (int i = 0; i < row; i++) 
      if (grid[i][col--] == 'x')
        count++;

    return count == 3 ? "Player : 1" : "Player : 2";
  }

  public static void main(String[] args) {
    char[][] grid = {
        { 'x', 'o', 'x' },
        { 'x', 'x', 'o' },
        { 'x', 'o', 'x' }
    };

    System.out.println(scanLeftDiagonal(grid));
  }
}