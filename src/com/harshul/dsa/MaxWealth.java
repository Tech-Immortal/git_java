package com.harshul.dsa;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int a = maximumWealth(arr);
        System.out.println(a);
    }
    static int maximumWealth(int[][] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            if(sum > max)
                max = sum;

        }
        return max;
    }
}
