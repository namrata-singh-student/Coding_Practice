/*
 * You are given a positive integer ‘N’. Your task is to print all prime numbers
 * less than or equal to N.
 * 
 * Note: A prime number is a natural number that is divisible only by 1 and
 * itself. Example - 2, 3, 17, etc.
 * 
 * You can assume that the value of N will always be greater than 1. So, the
 * answer will always exist.
 * 
 * Input Format
 * 
 * The input contains a single positive integer 'N'.
 * Constraints
 * 
 * 2 <= N <= 10^7
 * Where ‘N’ is the given positive integer.
 * 
 * Output Format
 * 
 * Print single space-separated prime numbers less than or equal to 'N' in
 * increasing order.
 * Sample Input 0
 * 
 * 7
 * Sample Output 0
 * 
 * 2 3 5 7
 * Explanation 0
 * 
 * For the given input, all prime numbers from 2 to 7 are 2, 3, 5 and 7.
 */

import java.io.*;
import java.util.*;

public class FindPrimeNumbers {
  private static boolean isPrime(int n) {
    int sqr;
    sqr = (int) Math.sqrt(n);
    if (n <= 1)
      return false;
    for (int i = 2; i <= sqr; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
