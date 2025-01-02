public class CheckIfStringIsRotatedByTwoPlaces {

  /**
   * This method checks if two strings are rotated by two places in the
   * clockwise and anti-clockwise direction. It first tries to rotate the
   * first string clockwise by two places and checks if the strings are equal.
   * If not, it tries to rotate it anti-clockwise by two places and checks if
   * the strings are equal. If both are false, it returns false.
   *
   * @param sx the first string
   * @param sy the second string
   * @return true if the strings are rotated by two places, false otherwise
   */

  public static boolean isRotatedByTwoPlaces(String sx, String sy) {
    if (sx.length() == 1 && sy.length() == 1)
      return false;
    int size = sx.length();

    /** Clockwise rotation */
    StringBuffer sbx = new StringBuffer(sx.substring(size - 2));
    StringBuffer newSx = sbx.append(sx.substring(0, size - 2));

    if (newSx.toString().equals(sy))
      return true;

    /** Anti-clockwise rotation */
    sbx = new StringBuffer(sx.substring(0, 2));
    newSx = new StringBuffer(sx.substring(2)).append(sbx);

    if (newSx.toString().equals(sy))
      return true;

    return false;
  }

  /**
   * Test case for isRotatedByTwoPlaces method
   *
   * @param args command line arguments
   */
  
  public static void main(String[] args) {
    String sx = "azx";
    String sy = "zxa";

    System.out.println(isRotatedByTwoPlaces(sx, sy));
  }
}