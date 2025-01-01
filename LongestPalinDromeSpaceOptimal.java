public class LongestPalinDromeSpaceOptimal {

  public static int longestPalindrome(String s) {
    int[] frequency = new int[128];

    for (int i = 0; i < s.length(); i++)
      frequency[s.charAt(i)]++;
      

    int palindrome = 0;

    for (int i = 0; i < frequency.length; i++) {
      if (frequency[i] % 2 == 0) {
        palindrome += frequency[i];
        frequency[i] = 0;
      } 
      else {
        palindrome += frequency[i] - 1;
        frequency[i] = 1;
      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (frequency[s.charAt(i)] == 1) {
        palindrome++;
        break;
      }
    }

    return palindrome;
  }

  public static void main(String[] args) {
    String s = "abcccAccTTTdHHd";

    System.out.println("Longest length of palindrom can be made from string " + s + " is : " + longestPalindrome(s));
  }
}