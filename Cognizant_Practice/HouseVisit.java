package Cognizant_Practice;

import java.util.*;

public class HouseVisit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    int index = 0;
    while (index >= 0 && index < n && arr[index] != -1) {
      count++;
      index = index + arr[index];
    }
    System.out.println(count);
  }
}
