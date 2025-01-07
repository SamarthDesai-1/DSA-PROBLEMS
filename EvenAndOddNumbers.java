public class EvenAndOddNumbers {


  public static String oddEven(String n) {
    int lastDigit = (n.charAt(n.length() - 1) - '0') % 10;

    return lastDigit % 2 == 0 ? "Even" : "Odd";
  } 
  


  public static void main(String[] args) {
    String n = "5688";
    
    System.out.println(n + " is : " + oddEven(n));
  }
}