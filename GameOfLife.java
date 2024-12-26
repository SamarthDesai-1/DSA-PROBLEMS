public class GameOfLife {

  public static void gameOfLife(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    for (int i = 0; i < row; i++) {

      for (int j = 0; j < col; j++) {

        if (x[i][j] == 0) {
          
        }
        else {

        }
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
  }
}