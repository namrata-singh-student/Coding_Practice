/*
 * You have a sequence 2,5,16,65,........Given an integer n as input. You have to find the value at the nth position in the sequence.

Input Format

A single integer n — the position in the sequence to find.
Constraints

1 <= n <= 10^4
Output Format

A single integer — the value at the nth position of the sequence, modulo 10^9 + 7
Sample Input 0

4
Sample Output 0

65
 */

import java.io.*;
import java.util.*;

public class SequenceFun {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = 1_000_000_007L;
    long a = 2;
    for (int i = 2; i <= n; i++) {
      a = ((i % MOD) * a + 1) % MOD;
    }
    System.out.println(a % MOD);

  }
}