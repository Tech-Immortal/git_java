package com.harshul.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimizedSubArray {
    static void main() {
        int[] arr = {2,3,1,1,1,1,1};
        System.out.println(sol(arr,5));
    }
    static int sol(int[] nums, int k){
        int ls = 0;
        int diff = Integer.MAX_VALUE;
        int max = 0;
        int  x = 0;
        int min = Integer.MIN_VALUE;
        for(int i= 0; i < nums.length; i++){
            max += nums[i];
        }
        for(int  i = 0 ; i < nums.length; i++){
            if(nums[i] > min){
                min = nums[i];
            }
        }
        int[] arr = new int[max-min+1];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = min;
            min++;
        }
        int start = 0;
        int end = arr.length-1;
        int sum = 0;
        int pieces = 1;
        int temp;
        while(start<=end){
            int  mid = start + (end-start)/2;
            x = 0;
            sum = 0;
            pieces = 1;
            temp = Integer.MIN_VALUE;
            while(x <= nums.length-1){
                if(sum+nums[x] <= arr[mid]){
                    sum += nums[x];
                    if(sum > temp){
                        temp = sum;
                    }
                    x++;
                }
                else {
                    sum = 0;
                    pieces++;
                }
            }
            if(pieces <= k){
                ls = temp;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
         return ls;
    }
}
