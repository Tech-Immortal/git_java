package com.harshul.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        Scanner in = new Scanner(System.in);
        System.out.println(arr[3].length); // this gives the no of rows in the array like here 5
        // to take input if there are variable num of column in the 2d array
        int row;
        for (row = 0; row < arr.length; row++){
            for ( int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        // for output
        for(int[] a : arr){ // int[] because every element is a 1d array in itself
            System.out.println(Arrays.toString(a));
        }
    }
}
