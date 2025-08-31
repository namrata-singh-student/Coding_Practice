// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a pattern

// Input Format

// A single integer n denoting the number of rows in the triangle pattern.
// Constraints

// 1<= n <= 100
// Output Format

// The pattern should be printed with n lines.
// Each line i contains the numbers from 1 to i, separated by a space.
// Sample Input 0

// 3
// Sample Output 0

// 1
// 1 2 
// 1 2 3 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}