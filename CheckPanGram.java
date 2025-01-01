import java.util.*;

public class CheckPanGram {

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

  public static void main(String[] args) {
    String s = "the quick brown fox jumps over the lazy dog";

    System.out.println("Is this a pangram string : " + isPangram(s));
  }
}