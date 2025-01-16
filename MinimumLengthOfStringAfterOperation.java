public class MinimumLengthOfStringAfterOperation {

  /**
   * Returns the minimum length of the string after the operation.
   *
   * This function takes a string and returns the minimum length of the string
   * after the following operation is applied: for each character in the string,
   * if the frequency of the character is even, remove two of it, else remove one
   * of it.
   *
   * @param s the input string
   * @return the minimum length of the string after the operation
   */
  public static int minimumLength(String s) {

    int[] frequency = new int[26];

    for (int i = 0; i < s.length(); i++)
      frequency[s.charAt(i) - 'a']++;

    int minLength = 0;
    for (int i = 0; i < frequency.length; i++) {
      int val = frequency[i];

      if (val != 0) {

        if (val % 2 == 0)
          minLength += 2;
        else
          minLength += 1;
      }
    }

    return minLength;
  }

  /**
   * A test driver for the minimumLength function.
   *
   * @param args command line arguments (not used)
   */
  
  public static void main(String[] args) {
    String s = "aa";

    System.out.println("Minimum length of string after operation is : " + minimumLength(s));
  }
}
