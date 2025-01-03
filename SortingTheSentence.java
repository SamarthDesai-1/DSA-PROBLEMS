public class SortingTheSentence {

  /**
   * Sorts a sentence containing words with numbers at the end of each word
   * in ascending order of the number.
   *
   * @param s the sentence to be sorted
   * @return the sorted sentence
   */

  public static String sortSentence(String s) {
    String[] arr = s.split(" ");

    String[] sorted = new String[arr.length];

    for (int i = 0; i < arr.length; i++) {
      String word = arr[i];
      int length = word.length();
      int num = word.charAt(length - 1) - '0';

      sorted[num - 1] = word.substring(0, length - 1);
    }

    StringBuffer sb = new StringBuffer();

    for (String x : sorted)
      sb.append(x).append(" ");

    return sb.toString().trim();
  }

  /**
   * Example usage of the sortSentence function.
   *
   * @param args not used
   */

  public static void main(String[] args) {
    String s = "this1 is3 a4 sentence2";

    System.out.println(sortSentence(s));
  }
}
