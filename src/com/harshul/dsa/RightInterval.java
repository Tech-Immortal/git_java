package com.harshul.dsa;

import java.util.Arrays;

public class RightInterval {
    static void main() {
        int[][] arr = {{1,1},{3,4}};
        System.out.println(Arrays.toString(ans(arr)));
    }
    static int[] ans(int[][] intervals){
        int[] arr = new int[intervals.length];
        Arrays.fill(arr, -1);
        int min = 0;
        int temp = Integer.MAX_VALUE;
        for(int c = 0; c < arr.length; c++){
            temp = Integer.MAX_VALUE;
            for(int j = 0; j < arr.length; j++){
                if( c!=j && intervals[c][1] <= intervals[j][0] && intervals[j][0] < temp){
                    arr[c] = j;
                    temp = intervals[j][0];
                }
            }
        }
        return arr;
    }
}
