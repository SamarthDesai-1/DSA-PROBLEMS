import java.util.*;

public class SubstringOfThreeLengthDistinctCharactersBruteForce {

  public static int subStringOfLengthThree(String s) {

    int start = 0;
    int end = 0;
    int distinctSunbstrings = 0;

    HashSet<Character> set = new HashSet<>();

    while (end < s.length()) {

      while ((end - start + 1) == 3) {
        
        for (int i = start; i <= end; i++) 
          set.add(s.charAt(i));

        if (set.size() == 3) 
          distinctSunbstrings++;

        set.clear();

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