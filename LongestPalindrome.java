public class LongestPalindrome {

  public static boolean flag = true;

  public static int longestPalindromeForLowerCase(String s, char caser) {
    int[] frequency = new int[26];
    int n = frequency.length;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
        frequency[s.charAt(i) - 'a']++;
    }

    int palindrome = 0;

    for (int i = 0; i < n; i++) {

      if (frequency[i] % 2 == 0) {
        palindrome += frequency[i];
        frequency[i] = 0;
      } 
      else {
        palindrome += frequency[i] - 1;
        frequency[i] = 1;
      }
    }

    for (int i = 0; i < n; i++) {

      if (flag == true && frequency[i] == 1) {
        palindrome++;
        flag = false;
        break;
      }
    }

    return palindrome;
  }

  public static int longestPalindromeForUpperCase(String s) {
    int[] frequency = new int[26];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        frequency[s.charAt(i) - 'A']++;
    }

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


    for (int i = 0; i < frequency.length; i++) {
      
      if (flag == true && frequency[i] == 1) {
        palindrome++;
        flag = false;
        break;
      }
    }

    return palindrome;
  }

  public static void main(String[] args) {
    String s = "abccccddDD";

    // int fromLower = longestPalindromeForLowerCase(s);
    // int fromupper = longestPalindromeForUpperCase(s);

    // System.out.println("Longest palindrom length is : " + (fromLower + fromupper));
  }
}