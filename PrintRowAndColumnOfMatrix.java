import java.util.ArrayList;

public class PrintRowAndColumnOfMatrix {

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

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
    int rowIndex = 1;
    int colIndex = 1;
  
    System.out.println("First array is row elements, and second array is column elements.");
    System.out.println(print(matrix, rowIndex, colIndex));
  } 
}