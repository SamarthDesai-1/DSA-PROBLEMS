import java.util.ArrayList;

public class PrintRowAndColumnOfMatrix {

  /**
   * Given a 2D matrix and a row index and column index,
   * return the row and column elements of the given index in the form of a 2D
   * list.
   * 
   * @param x        the 2D matrix
   * @param rowIndex the row index
   * @param colIndex the column index
   * @return a 2D list containing the row and column elements
   */
  
  public static ArrayList<ArrayList<Integer>> print(int[][] x, int rowIndex, int colIndex) {
    int row = x.length;
    int col = x[0].length;
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    ArrayList<Integer> rowElems = new ArrayList<>();

    for (int i = 0; i < col; i++)
      rowElems.add(x[rowIndex][i]);

    ans.add(rowElems);

    ArrayList<Integer> colElems = new ArrayList<>();

    for (int i = 0; i < row; i++)
      colElems.add(x[i][colIndex]);

    ans.add(colElems);

    return ans;
  }

  /**
   * This is a test main function, which prints the elements at specified row
   * index and column index.
   * 
   * @param args is the command line arguments.
   */

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
    int rowIndex = 1;
    int colIndex = 1;

    System.out.println("First array is row elements, and second array is column elements.");
    System.out.println(print(matrix, rowIndex, colIndex));
  }
}