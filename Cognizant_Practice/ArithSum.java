package Cognizant_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithSum {
  public static boolean isPrime(int n) {
    int sqr;
    sqr = (int) Math.sqrt(n);
    if (n == 0)
      return false;
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
    while (n > 9) {
      int sum = 0;
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      n = sum;
    }
    return n;
  }

  public static String[] transformCodes(int[] input) {
    String[] result = new String[input.length];
    for (int i = 0; i < input.length; i++) {
      int n = input[i];
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
      result[i] = ans.toString();
    }
    return result;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] input = new int[size];
    for (int i = 0; i < size; i++) {
      input[i] = sc.nextInt();
    }
    String[] output = transformCodes(input);
    System.out.println(String.join(",", output));
  }
}
