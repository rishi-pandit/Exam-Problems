/*Find the smallest number whose sum of digits is N
        Difficulty Level : Easy
        Last Updated : 05 Apr, 2021
        Given a positive integers N, the task is to find the smallest number whose sum of digits is N.
        Example:


        Input: N = 10
        Output: 19
        Explanation:
        1 + 9 = 10 = N

        Input: N = 18
        Output: 99
        Explanation:
        9 + 9 = 18 = N   */

package com.company;

public class Smallest_number {

    static int getSum(int n){
        int sum = 0;
        while(n!=0)
        {
            sum = sum + n%10;
            n= n/10;
        }
        return sum;
    }

    static void smallestNumber(int N){
        int i=1;
        while(i != 0)
        {
            //Checking if number has sum of digit = N
            if(getSum(i)==N)
            {
                System.out.print(i);
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int N=10;
        smallestNumber(N);

    }
}
