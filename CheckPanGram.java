import java.util.*;

public class CheckPanGram {

  /**
   * This function takes a string as an argument and checks if it is a pangram
   * string or not.
   * A pangram string is a string that contains all the 26 letters of the English
   * alphabets.
   * The function works by adding all the characters of the string to a HashSet,
   * which automatically eliminates any duplicates.
   * It then iterates over the English alphabets from 'a' to 'z' and checks if all
   * the characters are present in the HashSet.
   * If all the characters are present, the function returns true, else it returns
   * false.
   * 
   * @param s The string to be checked if it is a pangram or not.
   * @return true if the string is a pangram, false otherwise.
   */

  public static boolean isPangram(String s) {
    HashSet<Character> set = new HashSet<>();

    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) != ' ')
        set.add(s.charAt(i));

    for (int i = 'a'; i <= 'z'; i++)
      if (!set.contains((char) i))
        return false;

    return true;
  }

  /**
   * This is the main function of the class.
   * It creates a string and checks if it is a pangram or not.
   * It then prints the result of the check to the console.
   * 
   * @param args The argument list for the main function.
   */

  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog";

    System.out.println("Is this a pangram string : " + isPangram(s));
  }
}