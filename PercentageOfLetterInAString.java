public class PercentageOfLetterInAString {

  /**
   * This function takes a string and a character as input and returns the
   * percentage of the occurrences of the given character in the string.
   * The percentage is calculated by dividing the number of occurrences of the
   * given character by the length of the string.
   * The method then returns the result as an integer.
   * 
   * @param s The string to calculate the percentage of the given character in.
   * @param c The character to calculate the percentage of in the string.
   * @return The percentage of the occurrences of the given character in the
   *         string.
   */

  public static int percentage(String s, char c) {
    int occurrences = 0;
    int n = s.length();

    for (int i = 0; i < n; i++)
      if (s.charAt(i) == c)
        occurrences++;

    return (int) Math.floor(((double) occurrences / n) * 100);
  }

  /**
   * The main function calls the percentage function with the string
   * "sgawtbrdthfygvhb" and the letter 's'.
   * It then prints out the result returned from the percentage function.
   */
  
  public static void main(String[] args) {
    String s = "sgawtbrdthfygvhb";
    char letter = 's';

    System.out.println(percentage(s, letter));
  }
}
