public class DefangingAnIpAddress {

  /**
   * This method takes a string as an argument and returns a new string which
   * replaces all the
   * occurences of '.' with '[.]'. This is helpful in defanging an IP address, as
   * it makes the
   * IP address as a string unresolvable.
   * 
   * @param s the IP address which needs to be defanged
   * @return the defanged IP address as a string
   */

  public static String defangingStringVersion(String s) {
    StringBuffer buffer = new StringBuffer();

    int i = 0;

    while (i < s.length()) {

      if (s.charAt(i) == '.')
        buffer.append("[.]");

      else
        buffer.append(s.charAt(i) + "");

      i++;
    }

    return buffer.toString();
  }

  /**
   * This is the main method which tests the defangingStringVersion method.
   * It takes a string argument which is the IP address which needs to be
   * defanged.
   * The defanged string is then printed to the console.
   */
  
  public static void main(String[] args) {
    String s = "255.100.50.0";

    System.out.println("Defanging version of string is : " + defangingStringVersion(s));
  }
}