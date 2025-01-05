public class NumberOfSegmentsInAString {

  /**
   * Returns the number of segments in a given string. A segment is a
   * sequence of characters separated by spaces. The string is trimmed
   * first before counting the segments.
   * 
   * @param s the input string
   * @return the number of segments in the string
   */

  public static String countSegements(String s) {

    StringBuffer sb = new StringBuffer("");
    s = s.trim();
    int n = s.length();

    for (int i = 0; i < n;) {
      int j = i;

      while (j < n && s.charAt(j) != ' ') {
        sb.append(s.charAt(j));
        j++;
      }
      
      sb.append(" ");

      while (j < n && s.charAt(j) == ' ')
        j++;

      i = j;
    }

    return sb.toString().trim();
  }

  /**
   * Returns the number of segments in a given string. A segment is a
   * sequence of characters separated by spaces. The string is trimmed
   * first before counting the segments.
   * 
   * @param s the input string
   * @return the number of segments in the string
   */

  public static int space(String s) {
    s = s.trim();
    int n = s.length();

    int space = 0;
    s = countSegements(s);

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == ' ')
        space++;
    }

    return space + 1;
  }

  /**
   * The main method initializes a string and prints the number of segments in it.
   * A segment is defined as a sequence of characters separated by spaces.
   * The input string is passed to the space method which calculates and returns
   * the number of segments.
   * 
   * @param args command line arguments (not used)
   */

  public static void main(String[] args) {
    String s = "S a m a r t h";

    System.out.println("Segments in a string is : " + space(s));
  }
}
