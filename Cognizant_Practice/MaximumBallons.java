
package Cognizant_Practice;

import java.util.*;

public class MaximumBallons {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] ballons = new int[n];
    for (int i = 0; i < n; i++) {
      ballons[i] = sc.nextInt();
    }
    int[] cost = new int[n];
    for (int i = 0; i < n; i++) {
      cost[i] = sc.nextInt();
    }
    int maxBallons = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int currCost = cost[i] + cost[j];
        if (currCost <= k) {
          int noOfBallons = ballons[i] + ballons[j];
          maxBallons = Math.max(noOfBallons, maxBallons);
        }
      }
    }
    System.out.println(maxBallons);
  }
}
