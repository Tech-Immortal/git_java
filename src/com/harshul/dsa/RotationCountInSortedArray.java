package com.harshul.dsa;

public class RotationCountInSortedArray {
    static void main() {
        int[] nums = {5,6,7,1,2,3,4};
        System.out.println(noOfRoation(nums));
        System.out.println(findPivot(nums));
    }
    // this  takes time O(n)
    static int noOfRoation(int[] nums){
        int temp = nums[0];
        for(int i = 1; i <= nums.length - 1; i++){
            if(temp > nums[i]){
                return i;
            }
            temp = nums[i];
        }
        return 0;
    }
    // this would take O(log n)
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
