package Cognizant_Practice;

import java.util.*;

public class MinSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int sum = a[0] + a[1];
    System.out.print(sum);
  }

}
