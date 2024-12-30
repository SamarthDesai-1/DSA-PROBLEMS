public class SubstringOfThreeLengthDistinctCharactersOptimal {

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

  public static void main(String[] args) {
    String s = "npdrlvffzefb";

    System.out.println("Number of distinct substrings with length 3 in string " + s + " : " + subStringOfLengthThree(s));
  }
}
