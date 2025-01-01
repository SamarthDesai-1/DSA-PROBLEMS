public class CheckPermutationApproachTwo {

  static String sortStr(String x) {
    char[] content = x.toCharArray();
    java.util.Arrays.sort(content);

    return new String(content);
  }

  public static boolean isPermutation(String x, String y) {

    if (x.length() != y.length())
      return false;

    return sortStr(x).equals(sortStr(y));
  }

  public static void main(String[] args) {
    String x = "abc";
    String y = "cba";

    System.out.println(x + " is a permutation of " + y + " : " + isPermutation(x, y));
  }
}