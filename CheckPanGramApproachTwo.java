public class CheckPanGramApproachTwo {

  public static boolean isPangram(String s) {
    int[] alphabet = new int[26];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ')
        alphabet[s.charAt(i) - 'a'] = 1;
    }

    for (int z : alphabet)
      if (z == 0)
        return false;

    return true;
  }

  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog";
    
    System.out.println("Is this a pangram string : " + isPangram(s));

  }
}