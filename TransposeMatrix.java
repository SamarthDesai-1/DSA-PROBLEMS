public class TransposeMatrix {

  public static int[][] transposematrix(int[][] x) {
    int row = x.length;
    int col = x[0].length;

    int[][] transpose = new int[col][row];

    for (int i = 0; i < row; i++) 

      for (int j = 0; j < col; j++) 

        transpose[i][j] = x[i][j];
      

    return transpose;
  }

  public static void main(String[] args) {
    int[][] nums = {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
    };

    for (int[] x : transposematrix(nums)) {

      for (int xDash : x)
        System.out.print(xDash + " ");

      System.out.println();
    }
  }
}