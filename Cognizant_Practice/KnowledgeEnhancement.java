package Cognizant_Practice;

import java.util.*;

public class KnowledgeEnhancement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int N = sc.nextInt();
    int count = 0;
    int maxBookRead = 0;
    Arrays.sort(arr);
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += arr[i];
      if (sum <= N) {
        count++;
      } else {
        break;
      }
    }
    System.out.println(count);
  }
}
