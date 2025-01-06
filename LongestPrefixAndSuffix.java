public class LongestPrefixAndSuffix {

  /**
   * This function takes a string and prints out the longest prefix that is also a
   * suffix.
   * It iterates through the string and checks if the prefix is equal to the
   * suffix at each iteration.
   * If it finds a match, it updates the maximum length.
   * Finally, it prints out the maximum length that was found.
   * 
   * @param s the string to find the longest prefix and suffix
   */

  public static int longestPrefixSuffix(String s) {
    StringBuffer prefix = new StringBuffer("");
    StringBuffer suffix = new StringBuffer("");

    int index = s.length() - 1;

    int maxLength = Integer.MIN_VALUE;

    for (int i = 0; index >= 1 && i < s.length(); i++, index--) {
      prefix.append(s.charAt(i));
      suffix.append(s.charAt(index));

      suffix.reverse();

      if (prefix.toString().equals(suffix.toString()))
        maxLength = Math.max(maxLength, prefix.length());

      suffix.reverse();
    }

    return maxLength;
  }

  /**
   * The main method to test the longestPrefixSuffix function.
   * It initializes a sample string and calls the longestPrefixSuffix function
   * to print the length of the longest prefix which is also a suffix.
   * 
   * @param args command line arguments
   */

  public static void main(String[] args) {
    String s = "ABCDEABCD";

    System.out.println("Max length is : " + longestPrefixSuffix(s));
  }
}
