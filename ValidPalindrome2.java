public class ValidPalindrome2 {

  /**
   * Checks if the substring of the given string can be a palindrome by removing
   * at most one character.
   *
   * @param str   the input string to check
   * @param left  the starting index of the substring
   * @param right the ending index of the substring
   * @return true if the substring can be a palindrome by removing at most one
   *         character, false otherwise
   */

  public static boolean deleteOneChar(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        left++;
        right--;
      } 
      else
        return false;
    }
    return true;
  }

  /**
   * Checks if the substring of the given string is a palindrome by removing at
   * most one character.
   *
   * @param str   the input string to check
   * @param left  the starting index of the substring
   * @param right the ending index of the substring
   * @return true if the substring is a palindrome by removing at most one
   *         character, false otherwise
   */
  
  public static boolean isPalindrom(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left) == str.charAt(right)) {
        left++;
        right--;
      } 
      else
        return deleteOneChar(str, left + 1, right) || deleteOneChar(str, left, right - 1);
    }

    return true;
  }

  /**
   * A sample main program to test the isPalindrom function.
   * It creates a string and checks if it is a palindrome.
   * 
   * @param args the input arguments to the main program
   */

  public static void main(String[] args) {
    String str = "aba";

    int left = 0;
    int right = str.length() - 1;
    System.out.println("Status of the string : " + isPalindrom(str, left, right));

  }
}
