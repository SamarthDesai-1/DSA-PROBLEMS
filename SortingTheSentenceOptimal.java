public class SortingTheSentenceOptimal {

  public static int whiteSpaces(String s) {
    int spaces = 0;

    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) == ' ')
        spaces++;

    return spaces;
  }
 
  public static String sortSentence(String s) {
    int spaces = whiteSpaces(s);
    String[] sorted = new String[spaces + 1];

    StringBuffer ans = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      StringBuffer sb = new StringBuffer();

      int idx = i;
      
      while (idx < s.length() && s.charAt(idx) != ' ') {
        sb.append(s.charAt(idx++));
      }

      int num = sb.charAt(sb.length() - 1) - '0';
      sorted[num - 1] = sb.toString().substring(0, sb.length() - 1);

      i = idx;
    }

    for (String x : sorted)
      ans.append(x).append(" ");

    return ans.toString();
  }

  public static void main(String[] args) {
    String s = "this1 is3 a4 sentence2 correct5";

    System.out.println("Sorted order : " + sortSentence(s));
  }
}
