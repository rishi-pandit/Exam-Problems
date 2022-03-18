package com.company;

import java.util.Scanner;

public class Geometric_sequence_series {
    public static void main(String[] args) {
        int sequence = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sequence  : ");

        //input the length of the sequence
        int n = sc.nextInt();
        while(n!=0)
        {
            System.out.print(sequence);
            System.out.print("  ");
            sequence*=2;
            n-=1;
        }
        System.out.println(" ");

        System.out.println("Finished.....!");
    }
}
