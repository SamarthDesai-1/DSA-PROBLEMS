public class IntegerToRoman {

  public static String toRoman(int n) {
    StringBuffer roman = new StringBuffer("");

    String[] Romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    int index = 0;

    while (index < values.length) {

      while (n >= values[index]) {
        roman.append(Romans[index]);
        n -= values[index];
      }

      index++;
    }

    return roman.toString();
  }

  public static void main(String[] args) {
    int n = 3749;

    System.out.println(n + " to Roman : " + toRoman(n));
  }
}