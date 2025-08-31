/*
 * Geek is very fond of patterns. Once, his teacher gave him a star pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help to build a star pattern.

Input Format

A single integer n.
Constraints

1 ≤ n ≤ 100
Output Format

Print the pattern described above.
Each line contains stars separated by a space.
Sample Input 0

2
Sample Output 0

 *
* *
* *
 *
Sample Input 1

3
Sample Output 1

  *
 * *
* * *
* * *
 * *
  *
 */

import java.io.*;
import java.util.*;

public class PatternProgram {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named PatternProgram.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int sp = 0; sp < (n - i - 1); sp++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < n; i++) {
      for (int sp = 0; sp < i; sp++) {
        System.out.print(" ");
      }
      for (int j = n - 1 - i; j >= 0; j--) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }
}