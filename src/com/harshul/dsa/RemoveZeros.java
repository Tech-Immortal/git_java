package com.harshul.dsa;

import java.util.Arrays;

public class RemoveZeros {
    static void main() {
        int[] arr = {4,2,4,0,0,3,0,5,1,0};

        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
    static int[] moveZeroes(int[] nums){
        if(nums.length == 1)
            return nums;
        int start = 0;
        int end = 1;
        while(end<nums.length){
            if(nums[start] == 0 && nums[end] != 0){
                swap(nums,start,end);
                start++;
                end++;
            }
            else if(nums[start] !=0 && nums[end] == 0){
                start++;
                end++;
            }
            else
                end++;
        }
        return nums;
    }
    static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}

