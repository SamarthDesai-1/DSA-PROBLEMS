public class ValidPalindrome {

  /**
   * Returns true if the given StringBuilder is a palindrome and false otherwise.
   * A palindrome is a sequence of characters that is the same forwards and
   * backwards.
   * The StringBuilder is not modified.
   * 
   * @param sb the StringBuilder to check
   * @return true if the StringBuilder is a palindrome, false otherwise
   */
  
  public static boolean isPalindrome(StringBuilder sb) {
    int l = 0;
    int r = sb.length() - 1;
    while (l < r) {
      if (sb.charAt(l) != sb.charAt(r))
        return false;
      l++;
      r--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "0P";
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i)))
        sb.append(Character.toLowerCase(s.charAt(i)));
      else if (Character.isLowerCase(s.charAt(i)))
        sb.append(s.charAt(i));
      else if (Character.isDigit(s.charAt(i)))
        sb.append(s.charAt(i));
    }

    System.out.println(isPalindrome(sb));
  }
}
