package com.harshul.dsa;

import java.util.Arrays;

public class FindingPosition {
    public static void main(String[] args) {
        int[] nums = {5,5};
        int target = 1;
        int[] ans = findPosition(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findPosition(int[] nums, int target){
        int a = startPositon(nums,target);
        int b = endPostition(nums,target);
        return new int[]{a,b};
    }
    static int startPositon(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 0) {
            return -1;
        }
        if ( nums.length == 1){
            if(nums[start] == target)
                return start;
            else
                return -1;
        }
        while (start <= end) {
            if(nums[start]>target || nums[end] < target)
                return -1;
            int mid = (start+end)/2;
            if(nums[start] == target)
                break;
            if(nums[mid] >= target)
                end = mid-1;
            if(nums[mid] < target)
                start = mid + 1;
        }
        if(nums[start] == target)
            return start;
        else
            return -1;
        }
        static int endPostition(int[] nums, int target){
            int start = 0;
            int end = nums.length - 1;
            if (nums.length == 0) {
                return -1;
            }
            if ( nums.length == 1){
                if(nums[end] == target)
                    return end;
                else
                    return -1;
            }
            if(nums[start]>target || nums[end] < target)
                return -1;
            while (start <= end) {
                int mid = (start+end)/2;
                if(nums[end] == target)
                    break;
                if(nums[mid] <= target)
                    start = mid+1;
                if(nums[mid] > target)
                    end = mid - 1;
            }
            if(nums[end] == target)
                return end;
            else
                return -1;
    }
}