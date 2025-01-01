public class CheckIfStringIsRotatedByTwoPlaces {


  public static boolean isRotatedByTwoPlaces(String sx, String sy) {
    int size = sx.length();

    /** Clockwise rotation */
    StringBuffer sbx = new StringBuffer(sx.substring(size - 2));
    StringBuffer newSx = sbx.append(sx.substring(0, size - 2));

    if (newSx.toString().equals(sy))
      return true;


    /** Anti-clockwise rotation  */
    sbx = new StringBuffer(sx.substring(0, 2));
    newSx = new StringBuffer(sx.substring(2)).append(sbx);

    if (newSx.toString().equals(sy))
      return true;

    return false;
  }

  public static void main(String[] args) {
    String sx = "azx";
    String sy = "zxa";

    System.out.println(isRotatedByTwoPlaces(sx, sy));
  } 
}