package com.company;

public class Staircase {
    public static void main(String[] args) {
        int[][] a = new int [][] {
                {2,3,4,5,6},
                {1,7,20,8},
                {1,4,5,6,7,8,9,0},
                {0,9,8}
        };

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
