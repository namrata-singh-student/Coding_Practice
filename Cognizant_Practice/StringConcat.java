package Cognizant_Practice;

import java.util.*;

public class StringConcat {
  public static boolean isPrime(int n) {
    int sqr;
    sqr = (int) Math.sqrt(n);
    if (n <= 1)
      return false;
    for (int i = 2; i <= sqr; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int isDigitSum(int n) {
    while (n >= 10) {
      int sum = 0;
      while (n != 0) {
        sum += n % 10;
        n = n / 10;
      }
      n = sum;
    }
    return n;
  }

  public static String[] transformCodes(ArrayList<Integer> input) {
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < input.size(); i++) {
      int n = input.get(i);
      StringBuilder ans = new StringBuilder();
      if (String.valueOf(n).length() == 6) {
        ans.append("C");
      } else {
        ans.append("W");
      }
      if (n == 0) {
        ans.append("Z");
      } else if (n == 1) {
        ans.append("O");
      } else if (isPrime(n)) {
        ans.append("P");
      } else {
        ans.append("N");
      }
      ans.append(isDigitSum(n));

      if (n % 2 == 0) {
        n = n / 2;
        ans.append(n);
      } else {
        n = (n - 1) / 2;
        ans.append(n);
      }
      result.add(ans.toString());
    }
    return result.toArray(new String[0]);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> input = new ArrayList<>();
    for (int i = 0; i < input.size(); i++) {
      input.add(sc.nextInt());
    }
    String[] output = transformCodes(input);
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i]);
      if (i != output.length - 1) {
        System.out.print(",");
      }
    }
  }

}
