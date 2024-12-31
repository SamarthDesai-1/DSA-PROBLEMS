public class DefangingAnIpAddress {

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

  public static void main(String[] args) {
    String s = "255.100.50.0";

    System.out.println("Defanging version of string is : " + defangingStringVersion(s));
  }
}