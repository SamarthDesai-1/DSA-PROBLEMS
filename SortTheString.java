import java.util.Scanner;

public class SortTheString {

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

  public static void main(String[] args) {
    
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string to be sorted : ");
      String s = input.next();

      System.out.println("Sorted string is : " + sort(s));
    }
  }
}