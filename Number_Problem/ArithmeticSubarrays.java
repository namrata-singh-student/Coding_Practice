/*
 * You are given an array ‘A’ of length ‘N’, you have to tell the number of
 * arithmetic subarrays that exist in the array ‘A’.
 * 
 * An Arithmetic subarray is a subarray that has 3 or more elements and the
 * difference between consecutive elements is the same. Eg: [1, 3, 5, 7] has a
 * length of 4, and diff between any two consecutive elements is 2.
 * 
 * Note: A subarray is a slice from a contiguous array (i.e., occupy consecutive
 * positions) and inherently maintains the order of elements.
 * 
 * Input Format
 * 
 * The first line of the input contains 'T' denoting the number of test cases.
 * The first line of each test case contains the three integers N, length of the
 * array.
 * The second line of each test case contains N space-separated integers of the
 * array A.
 * Constraints
 * 
 * 1 <= T <= 100
 * 1 <= N <= 3000
 * 0 <= A[i] <= 5000
 * Output Format
 * 
 * For each test case, return the number of arithmetic subarrays that can be
 * formed.
 * Sample Input 0
 * 
 * 2
 * 4
 * 1 3 5 7
 * 2
 * 1 2
 * Sample Output 0
 * 
 * 3
 * 0
 * Explanation 0
 * 
 * In test case 1:
 * 
 * We have A = [1 3 5 7] Diff of consecutive elements: A[1]- A[0] = 3-1 = 2
 * A[2]- A[1] = 5-3 = 2 A[3]- A[2] = 7-5 = 2
 * 
 * [1 3 5], [3 5 7], and [1 3 5 7] are the three arithmetic subarray. Thus the
 * answer is 3.
 * 
 * In test case 2:
 * 
 * We have A = [1 2] The length of the array is 2, which means that there can be
 * no subarray of length 3 or more. Thus the number of arithmetic subarrays is
 * 0.
 */

import java.io.*;
import java.util.*;

public class ArithmeticSubarrays {
  public static int consecutiveArith(int N, int[] a) {

    if (N < 3) {
      return 0;
    }
    int curr = 0;
    int count = 0;
    for (int i = 2; i < N; i++) {
      if (a[i] - a[i - 1] == a[i - 1] - a[i - 2]) {
        curr = curr + 1;
        count += curr;
      } else {
        curr = 0;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int N = sc.nextInt();
      int[] a = new int[N];
      for (int i = 0; i < N; i++) {
        a[i] = sc.nextInt();
      }
      int res = consecutiveArith(N, a);
      System.out.println(res);
    }
  }
}