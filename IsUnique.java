public class IsUnique {

  public static boolean isUnique(String s) {
    int n = s.length();

    if (n > 128)
      return false;

    boolean[] frequency = new boolean[128];

    for (int i = 0; i < n; i++) {
      int val = s.charAt(i);

      if (frequency[val])
        return false;

      frequency[val] = true;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "abCcdeXfghH";

    System.out.println("This string contains all unique characters : " + isUnique(s));
  }
}