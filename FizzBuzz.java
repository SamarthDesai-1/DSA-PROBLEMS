import java.util.*;
import java.util.ArrayList;

public class FizzBuzz {

  public static ArrayList<String> fizzBuzz(int n) {

    ArrayList<String> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {

      if (i % 3 == 0 && i % 5 == 0)
        list.add("FizzBuzz");
      else if (i % 3 == 0)
        list.add("Fizz");
      else if (i % 5 == 0)
        list.add("Buzz");
      else 
        list.add(i + "");
    }

    return list;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter N : ");
      int n = input.nextInt();

      System.out.println(fizzBuzz(n));
    }
  }
}