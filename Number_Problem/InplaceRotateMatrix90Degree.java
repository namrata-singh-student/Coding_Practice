
/*
 * You are given a square matrix of non-negative integers of size 'N x N'. Your
 * task is to rotate that array by 90 degrees in an anti-clockwise direction
 * without using any extra space.
 * 
 * For example:
 * 
 * For given 2D array :
 * 
 * [ [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ] ]
 * After 90 degree rotation in anti clockwise direction, it will become:
 * 
 * [ [ 3, 6, 9 ],
 * [ 2, 5, 8 ],
 * [ 1, 4, 7 ] ]
 * Input Format
 * 
 * The first line of input contains an integer 'T' representing the number of
 * the test case. Then the test case follows.
 * The first line of each test case contains an integer 'N' representing the
 * size of the square matrix ARR.
 * Each of the next 'N' lines contains 'N' space-separated integers representing
 * the elements of the matrix 'ARR'.
 * Constraints
 * 
 * 1 ≤ T ≤ 50
 * 1 ≤ N ≤ 100
 * 1 ≤ ARR[i][j] ≤ 10^9
 * Output Format
 * 
 * For each test case, return the rotated matrix.
 * Sample Input 0
 * 
 * 2
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * Sample Output 0
 * 
 * 3 6 9
 * 2 5 8
 * 1 4 7
 * 4 8 12 16
 * 3 7 11 15
 * 2 6 10 14
 * 1 5 9 13
 * Explanation 0
 * 
 * (i) The array has been rotated by 90 degrees in an anticlockwise direction as
 * the first row is now the first column inverted and so on for second and third
 * rows.
 * (ii) The array has been rotated by 90 degrees in an anticlockwise direction
 * as the first row is now first column inverted and so on for second, third and
 * fourth rows.
 */
import java.io.*;
import java.util.*;

public class InplaceRotateMatrix90Degree {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int m = sc.nextInt();
      int n = m;
      int[][] mat = new int[m][n];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          mat[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < m; i++) {
        int left = 0, right = n - 1;
        while (left <= right) {
          int temp = mat[i][left];
          mat[i][left] = mat[i][right];
          mat[i][right] = temp;
          left++;
          right--;
        }
      }
      for (int i = 0; i < m; i++) {
        for (int j = i; j < n; j++) {
          int temp = mat[i][j];
          mat[i][j] = mat[j][i];
          mat[j][i] = temp;
        }
      }
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(mat[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}