import java.util.ArrayList;

public class GenerateAllSubstrings {

  public static ArrayList<String> allSubstringsVowels(String s) {

    int n = s.length();
    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {

      for (int j = i; j < n; j++) {
        
        StringBuffer sb = new StringBuffer("");
        for (int k = i; k <= j; k++) {
          sb.append(s.charAt(k));
        }

        list.add(sb.toString());
      }
    }

    return list;
  }

  public static void main(String[] args) {
    String s = "aba";

    System.out.println(allSubstringsVowels(s));
  }
}