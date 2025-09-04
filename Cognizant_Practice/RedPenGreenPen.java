package Cognizant_Practice;

import java.util.Scanner;

public class RedPenGreenPen {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 1; i < N; i++) {
      if (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0) {
        count++;
      }
    }
    System.out.print(count);
  }

}
