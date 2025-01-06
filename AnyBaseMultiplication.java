import java.util.*;

public class AnyBaseMultiplication {

  public static int addition(int base, int numOne, int numTwo) {

    int returnVal = 0;
    int p = 1;
    int carry = 0;
    
    /** Main logic */
    while (numOne > 0 || numTwo > 0 || carry > 0) {
      int digitOne = numOne % 10;
      int digitTwo = numTwo % 10;

      numOne /= 10;
      numTwo /= 10;

      int digit = digitOne + digitTwo + carry;
      carry = digit / base;
      digit %= base;

      returnVal += digit * p;
      p *= 10;
    }

    return returnVal;
  }

  public static int getProductWithSingleDigit(int base, int numOne, int singleDigit) {

    int returnVal = 0;
    int carry = 0;
    int p = 1;

    while (numOne > 0 || carry > 0) {
      int digitOne = numOne % 10;
      numOne /= 10;

      int digit = digitOne * singleDigit + carry;
      carry = digit / base; /** carry == quotient */
      digit = digit % base; /** remainder spare part */
      
      returnVal += digit * p;
      p *= 10;
    }

    return returnVal;
  }

  public static int getProduct(int base, int numOne, int numTwo) {

    int returnVal = 0;
    int p = 1;

    while (numTwo > 0) {
      
      int digitTwo = numTwo % 10;
      numTwo /= 10;
      
      int singleProduct = getProductWithSingleDigit(base, numOne, digitTwo);
      returnVal = addition(base, returnVal, singleProduct * p);
      p *= 10;
    }
    return returnVal;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      
      System.out.print("Enter number one : ");
      int numOne = sc.nextInt();

      System.out.print("Enter number two : ");
      int numTwo = sc.nextInt();

      System.out.print("Enter BASE : ");
      int base = sc.nextInt();

      long ans = getProduct(base, numOne, numTwo);
      System.out.println("Answer : " + ans);
    }
  } 
}