import java.util.Scanner;

public class SortTheString {

  /**
   * Sorts a given string in lexicographical order in-place.
   *
   * @param s the string to be sorted
   * @return the sorted string
   */

  public static String sort(String s) {
    StringBuilder sb = new StringBuilder();

    int[] alphabets = new int[26];

    for (int i = 0; i < s.length(); i++)
      alphabets[s.charAt(i) - 'a']++;

    for (int i = 0; i < alphabets.length; i++) {

      while (alphabets[i] != 0) {
        sb.append((char) (i + 'a'));

        alphabets[i]--;
      }
    }

    return sb.toString();
  }

  /**
   * Entry point of the program. This method will take a string input from the
   * user
   * and display the sorted string to the user.
   * 
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string to be sorted : ");
      String s = input.next();

      System.out.println("Sorted string is : " + sort(s));
    }
  }
}