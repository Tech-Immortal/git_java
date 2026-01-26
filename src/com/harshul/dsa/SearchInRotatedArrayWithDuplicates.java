package com.harshul.dsa;

import java.util.Scanner;

public class SearchInRotatedArrayWithDuplicates {
    static void main() {
        int[] arr = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(ans(arr,13));
    }
    static boolean ans(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        boolean x = false;
        boolean y = false;
        if(nums.length  == 1 ){
            if(nums[0] == target) {
                return true;
            }
            else {
                return false;
            }
        }
        if(nums[mid] != nums[end]){
            int a = separating(nums);
            x = search(nums, 0, a-1, target);
            if(x){
                 return x;
            }
            else{
                y = search(nums,a,end,target);
                return y;
            }
        }
        else{
            int[] num = sol(nums);
            if(num[0] == start){
                end = num[1];
                x = search(nums, 0, end, target);
                if(x){
                    return x;
                }
                else{
                    y = search(nums,end+1, nums.length-1,target);
                    return y;
                }

            }
            else {
                start = num[0];
                x = search(nums, start, num[1], target);
                if(x){
                    return x;
                }
                else{
                    y = search(nums, 0, start-1, target);
                    return y;
                }
            }

        }

    }
    static boolean search(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return false;
    }
    static int separating(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }
            else
                end = mid;
        }
        return start;
    }
    static int[] uniqueElementsWhenMidEqualsEnd (int[] arr){
        int[] num = new int[arr.length];
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if( i == 0){
                num[count] = arr[i];
                count++;
            }
            else if ( arr[i] > arr[i-1]){
                num[count] = arr[i];
                count++;
            }
        }
        int[] nums = new int[count];
        for(int i = 0; i < count; i++){
            nums[i] = num[i];
        }
        return nums;
    }
    static int[] sol(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while(arr[start] == arr[mid] && arr[end] == arr[mid] && start<=end){
            start++;
            end--;
        }
        if(arr[start] > arr[mid]){
            return new int[]{0,start};
        }
        else if(arr[start] < arr[mid]){
            return new int[]{start,arr.length-1};
        }
        else if(arr[end] > arr[mid]){
            return new int[]{0,end};
        }
        else if(arr[end] < arr[mid]){
            return new int[]{end,arr.length-1};
        }
        return new int[]{start,end};
    }
}
