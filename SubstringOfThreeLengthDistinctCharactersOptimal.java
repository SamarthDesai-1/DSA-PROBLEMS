public class SubstringOfThreeLengthDistinctCharactersOptimal {

  /**
   * This function takes a string s as an argument and returns the count of all
   * the distinct substrings of length 3 in the string. A distinct substring is
   * defined as a substring where all the characters are distinct. The time
   * complexity of the function is O(n), where n is the length of the string.
   */

  public static int subStringOfLengthThree(String s) {
    int start = 0;
    int end = 0;
    int distinctSunbstrings = 0;

    while (end < s.length()) {

      while ((end - start + 1) == 3) {

        char a = s.charAt(start);
        char b = s.charAt(start + 1);
        char c = s.charAt(end);

        if (a != b && b != c && a != c)
          distinctSunbstrings++;

        start++;
      }
      end++;
    }

    return distinctSunbstrings;
  }

  /**
   * This is the main entry point of the class. It takes an array of strings as
   * command line arguments and prints out the number of distinct substrings of
   * length 3 in the first command line argument to the console.
   */
  
  public static void main(String[] args) {
    String s = "npdrlvffzefb";

    System.out.println("Number of distinct substrings with length 3 in string " + s + " : " + subStringOfLengthThree(s));
  }
}
