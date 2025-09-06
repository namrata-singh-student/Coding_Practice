/*
Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.

For example: 'N' = 5. The divisors of 5 are 1, 5.

Input Format

The input consists of a single line containing an integer, 'N'.
Constraints

1 <= 'N' <= 10^5
Output Format

The output should be a single line containing the divisors of 'N', separated by spaces, in ascending order.
Sample Input 0

10
Sample Output 0

1 2 5 10
Explanation 0

The divisors of 10 are 1,2,5,10.

Sample Input 1

6
Sample Output 1

1 2 3 6
Explanation 1

The divisors of 6 are 1, 2, 3, and 6.

  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 1 ; i<=n ; i++){
            if(n % i == 0){
                ans.add(i);
            } 
        }
        for(int i = 0 ; i< ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
