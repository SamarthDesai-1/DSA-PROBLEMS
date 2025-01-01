public class LongestPalinDromeOptimal {

  public static boolean flag = true;

  public static int longestPalindrome(String s, char caser) {
    char begin = caser == 'a' ? 'a' : 'A';
    char end = caser == 'a' ? 'z' : 'Z';
    
    int[] frequency = new int[26];
    int palindrom = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= begin && s.charAt(i) <= end)
        frequency[s.charAt(i) - begin]++;
    }

    for (int i = 0; i < frequency.length; i++) {
      if (frequency[i] % 2 == 0) {
        palindrom += frequency[i];
        frequency[i] = 0;
      }
      else {
        palindrom += frequency[i] - 1;
        frequency[i] = 1;
      }
    }

    for (int i = 0; i < frequency.length; i++) {
      if (flag == true && frequency[i] == 1) {
        palindrom++;
        flag = false;
        break;
      }
    }

    return palindrom;
  }

  public static void main(String[] args) {
    String s = "abcccAccTTTdHHd";

    int lowerCase = longestPalindrome(s, 'a');
    int upperCase = longestPalindrome(s, 'A');
    
    System.out.println("Longest length of palindrom can be made from string " + s + " is : " + (lowerCase + upperCase));

    flag = true;
  } 
}