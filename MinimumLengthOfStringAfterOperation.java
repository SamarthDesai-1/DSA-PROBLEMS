public class MinimumLengthOfStringAfterOperation {

  public static int minimumLength(String s) {

    int[] frequency = new int[26];

    for (int i = 0; i < s.length(); i++) 
      frequency[s.charAt(i) - 'a']++;

    int minLength = 0;
    for (int i = 0; i < frequency.length; i++) {
      int val = frequency[i];

      if (val != 0) {

        if (val % 2 == 0)
          minLength += 2;
        else
          minLength += 1;
      }
    }

    return minLength;
  }

  public static void main(String[] args) {
    String s = "aa";

    System.out.println("Minimum length of string after operation is : " + minimumLength(s));
  }
}
