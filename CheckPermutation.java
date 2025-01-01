public class CheckPermutation {

  public static boolean isPermutation(String x, String y) {

    if (x.length() != y.length())
      return false;

    int[] frequency = new int[128];

    for (int i = 0; i < y.length(); i++)
      frequency[y.charAt(i)]++;


    for (int i = 0; i < x.length(); i++) {
      frequency[x.charAt(i)]--;

      if (frequency[x.charAt(i)] < 0) 
        return false;
    }

    
    return true;
  }

  public static void main(String[] args) {
    String x = "abcc";
    String y = "cbaa";

    System.out.println(x + " is a permutation of " + y + " : " + isPermutation(x, y));
  }
}
