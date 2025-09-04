package Cognizant_Practice;

import java.util.*;

public class MinimumSumOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    int[] B = new int[n];
    for (int i = 0; i < n; i++) {
      B[i] = sc.nextInt();
    }
    int minSum = Integer.MAX_VALUE;
    for (int i = 0; i < n - 1; i++) {
      int temp = A[i];
      A[i] = A[i + 1];
      A[i + 1] = temp;
      int sum1 = A[i] + B[i];
      int sum2 = A[i + 1] + B[i + 1];
      int multi = sum1 * sum2;
      minSum = Math.min(minSum, multi);
    }
    System.out.println(minSum);
  }
}
