public class AddingSpacesToAString {

  /**
   * Inserts spaces into a given string at specified indices.
   *
   * @param s      the input string where spaces are to be inserted
   * @param spaces an array of indices in the string where spaces should be
   *               inserted
   * @return a new string with spaces inserted at the specified indices
   */

  public static String insertSpaces(String s, int[] spaces) {
    StringBuffer sb = new StringBuffer();
    int n = spaces.length;

    if (n == 1) 
      sb.append(s.substring(0, spaces[0])).append(" ");

    int i = 0;
    while (i < n - 1) {
      if (i == 0) 
        sb.append(s.substring(0, spaces[i])).append(" ");

      sb.append(s.substring(spaces[i], spaces[i + 1])).append(" ");

      i++;
    }

    sb.append(s.substring(spaces[n- 1]));

    return sb.toString();
  }

  /**
   * Example usage of the insertSpaces method.
   * 
   * @param args ignored
   */

  public static void main(String[] args) {
    String s = "ezixkFLjdbxrDowLVGYvdtBrguAAJVM";
    int[] spaces = { 23 };

    System.out.println("After adding spaces on specified indexes : " + insertSpaces(s, spaces));
  }
}