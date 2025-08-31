/*
 * Given an integer N, print an inverted isosceles triangle of stars such that the height of the triangle is N.

Input Format

A single integer N, representing the height of the inverted isosceles triangle.
Constraints

1 <= N <= 100
Output Format

A list (or vector) of strings where each string represents a line of the inverted isosceles triangle pattern, aligned properly with spaces and stars (*).
Sample Input 0

4
Sample Output 0

*******
 *****
  ***
   *
Sample Input 1

3
Sample Output 1

*****
 ***
  *
 */

import java.io.*;
import java.util.*;

public class InvertedTriangleOfStars {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int sp = 0; sp < i; sp++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (2 * (n - i) - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}