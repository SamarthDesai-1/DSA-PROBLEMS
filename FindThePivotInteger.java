public class FindThePivotInteger {

  /**
   * Finds the pivot integer in the range from 1 to n (inclusive) whose left sum
   * and right sum are equal. If no such integer exists, returns -1.
   *
   * @param n the upper limit of the range (inclusive)
   * @return the pivot integer or -1 if not found
   */

  public static int pivotInteger(int n) {

    int totalSum = n * (n + 1) / 2;
    int prefixSum = 0;

    for (int i = 1; i <= n; i++) {
      prefixSum += i;

      if (totalSum - prefixSum == prefixSum - i)
        return i;
    }

    return -1;
  }

  /**
   * Prints the pivot integer to the console for a given upper limit of 8
   * 
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    int n = 8;

    System.out.println("Pivot integer is : " + pivotInteger(n));
  }
}