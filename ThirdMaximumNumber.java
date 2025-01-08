import java.util.*;

public class ThirdMaximumNumber {

  public static int maxNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int x : nums)
      set.add(x);

    ArrayList<Integer> list = new ArrayList<>();
    for (int x : set)
      list.add(x);

    Collections.sort(list);

    if (list.size() >= 3)
      return list.get(list.size() - 3);

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < list.size(); i++)
      max = Math.max(max, list.get(i));

    return max;
  }

  public static void main(String[] args) {
    int[] nums = { -1, -2, -97, -100, -256, -356 };

    System.out.println("Third maximum number is : " + maxNumber(nums));
  }
}