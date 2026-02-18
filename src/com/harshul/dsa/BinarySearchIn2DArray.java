package com.harshul.dsa;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    static void main() {
        int rows = 4;
        int cols = 4;
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

//        arr[0][0] = 10;
//        arr[0][1] = 20;
//        arr[0][2] = 30;
//        arr[0][3] = 40;
//
//        for (int i = 1; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                arr[i][j] = arr[i - 1][j] + 2;
//            }
//        }
//        System.out.println(Arrays.toString(search(arr, 44)));

        System.out.println(Arrays.toString(searchN(arr,1)));
        System.out.println(Arrays.toString(searchM(arr,1)));

    }
    // When the matrix is sorted in row-wise manner and column wise manner also.  Like -
    //    1  2  3  4
    //    6  7  8  9
    //    11 12 13 13
    //    16 17 18 19
    static int[] search(int[][] arr, int target){
        int start = 0;
        int end = arr[0].length-1;
        while(start<=end){
            if(arr[start][end] == target) return new int[]{start,end};
            if(arr[start][end] > target) end--;
            else start++;
        }
        return new int[]{start,end};
    }
    // When the whole array is in sorted order
    // 1  2  3  4
    // 5  6  7  8
    // 9  10  11  12
    // 13  14  15  16

    static int[] searchN(int[][] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int col = (arr[0].length-1)/2;
        while(end-start > 1){
            int mid = start + (end-start)/2;
            if(arr[mid][col] == target) return new int[]{mid,col};
            else if ( arr[mid][col] > target) end = mid;
            else start = mid;
        }
        int x = 0;
        int y = arr[start].length-1;
        while(x<=y){
            int mid = x + (y-x)/2;
            if(arr[start][mid] == target) return new int[]{start,mid};
            else if ( arr[start][mid] < target) x = mid + 1;
            else y = mid - 1;
        }
        int u = 0;
        int v = arr[end].length-1;
        while(u<=v){
            int mid = u + (v-u)/2;
            if(arr[end][mid] == target) return new int[]{end,mid};
            else if ( arr[end][mid] < target) u = mid + 1;
            else v = mid - 1;
        }
        return new int[]{-1,-1};
    }
    // search in fully sorted matrix using 1d mapping method
    static int[] searchM(int[][] arr, int target){
        int start = 0;
        int col = arr[0].length;
        int end = arr.length*col - 1;
        while(start<=end){
            col = arr[0].length;
            int index = start + (end-start)/2;
            int row = index / col;
            col = index % col;
            if(arr[row][col] == target) return new int[]{row,col};
            else if ( arr[row][col] > target) end = index-1;
            else start = index + 1;
        }
        return new int[]{-1,-1};
    }
}
