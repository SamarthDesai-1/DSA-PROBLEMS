import java.util.*;

public class KthDistinctStringInAnArray {

  /**
   * This function returns kth distinct string in given array of strings.
   *
   * @param arr array of strings
   * @param k   kth distinct string to find
   * @return kth distinct string
   */

  public static String kthDistinctString(String[] arr, int k) {

    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {

      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    for (String s : arr) {
      if (map.get(s) == 1)
        k--;
      if (k == 0)
        return s;
    }

    return "";
  }

  /**
   * Example program to show the usage of kthDistinctString function
   *
   * @param args command line arguments
   */
  
  public static void main(String[] args) {
    String[] arr = { "aaa", "aa", "a" };
    int k = 1;

    System.out.println("Kth character is : " + kthDistinctString(arr, k));
  }
}