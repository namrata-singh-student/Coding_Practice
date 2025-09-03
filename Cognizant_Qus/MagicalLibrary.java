package Cognizant_Qus;

import java.util.*;

public class MagicalLibrary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int sum = 0;
    int count = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] % 2 != 0) {
          sum += arr[i][j];
          if (sum > 0 && sum % 2 == 0) {
            count++;
          }
        }
      }
      sum = 0;
    }
    System.out.print(count);
  }
}
