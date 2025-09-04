package Cognizant_Practice;

import java.util.*;

public class MaximumBooks {
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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int maxBooks = 0;
    for (int i = 1; i < n; i++) {
      if (isPrime(i + 1)) {
        maxBooks += Math.min(k, arr[i]);
      }
    }
    System.out.println(maxBooks);
  }
}
