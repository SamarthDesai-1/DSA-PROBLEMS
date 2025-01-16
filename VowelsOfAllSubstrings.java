public class VowelsOfAllSubstrings {

  public static long allSubstringsVowels(String s) {

    int n = s.length();
    String vowels = "aeiouAEIOU";
    long count = 0;

    for (int i = 0; i < n; i++) {

      for (int j = i; j < n; j++) {
        
        for (int k = i; k <= j; k++) {
          if (vowels.contains(s.charAt(k) + "")) {
            count++;
          }
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String s = "aba";

    System.out.println("Count : " + allSubstringsVowels(s));
  }
}