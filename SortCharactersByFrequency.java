public class SortCharactersByFrequency {

  /**
   * Sort characters in a string by their frequency, in descending order of their
   * count.
   * If two characters have the same frequency, sort them in ascending order of
   * their ASCII value.
   * 
   * @param s the string to sort
   * @return the sorted characters
   */

  public static String sortByFrequency(String s) {

    int[] frequency = new int[128];
    int n = frequency.length;

    for (int i = 0; i < s.length(); i++)
      frequency[s.charAt(i)]++;

    StringBuffer sortedChars = new StringBuffer("");
    for (int i = 0; i < n; i++) {

      int max = Integer.MIN_VALUE;
      int index = -1;

      for (int j = 0; j < n; j++) {
        if (frequency[j] > max) {
          max = frequency[j];
          index = j;
        }
      }

      int charFrequency = frequency[index];
      while (charFrequency-- != 0) {
        sortedChars.append((char) index);

      }

      frequency[index] = 0;
    }

    return sortedChars.toString();
  }

  /**
   * Unit test for sortByFrequency.
   * 
   * @param args command line arguments (not used)
   */

  public static void main(String[] args) {
    String s = "mfrcuTGHIOPnuihurOIDHurif";

    System.out.println("Sorted characters by frequency : " + sortByFrequency(s));
  }
}