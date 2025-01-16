public class AlternatingDigitSum {

  /**
   * @param n the number to compute the size of
   * @return the number of digits in n
   */
  
  public static int size(int n) {
    int size = 0;

    while (n > 0) {
      size++;
      n /= 10;
    }

    return size;
  }

  /**
   * @param n the number to compute the alternating digit sum of
   * @return the alternating digit sum of n
   */
  public static int minimumOperations(int n) {
    int size = size(n);

    int sum = 0;

    while (n > 0) {
      int lastDigit = n % 10;

      sum = sum + (size % 2 == 0 ? lastDigit * -1 : lastDigit);

      size--;

      n /= 10;
    }

    return sum;
  }

  public static void main(String[] args) {
    int n = 886996;

    System.out.println("Alternating digit sum is : " + minimumOperations(n));
  }
}