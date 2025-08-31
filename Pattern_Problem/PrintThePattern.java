
/*
 * Given an integer N, you need to print the following pattern.

Input Format

A single integer N
Constraints

1 <= N <= 9
Output Format

A square pattern of size (2*N - 1) × (2*N - 1)
Each row is printed on a new line, containing numbers without spaces between them.
Sample Input 0

3
Sample Output 0

33333
32223
32123
32223
33333
Explanation 0

When N = 3 then there will be three boundaries. Outer boundary contains only 3. Middle boundary contains only 2. And the inner boundary contains only 1.
 */
import java.io.*;
import java.util.*;

public class PrintThePattern {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size = 2 * n - 1;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        int minDist = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
        int value = n - minDist;
        System.out.print(value);
      }
      System.out.println();
    }
  }
}