package com.harshul.dsa;

import java.util.Arrays;

public class FindRepeatedElement {
    static void main() {
        int[] arr  =  {1,5,3,4,2,5,6};
        System.out.println(findEle(arr));
        System.out.println(findElement(arr));
    }
    // this method uses more space complexity as we are creating a boolean array ( but is faster O(n) )
    static int findEle(int[] nums){
        int n = nums.length;
        int temp = 0;
        boolean[] arr = new boolean[n];
        for(int i = 0; i < n; i++){
            arr[nums[i]] = !arr[nums[i]];
            if(!arr[nums[i]]){
                temp = nums[i];
                break;
            }
        }
        return temp;
    }
    // this method on the other hand uses constant space complexity but slower O(nlogn)
    static int findElement(int[] nums){
        int start = 1;
        int temp = 0;
        int end = nums.length-1;
        while(start<end){
            temp = 0;
            int mid = start + (end-start)/2;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] <=  mid){
                    temp++;
                }
//                if(temp > mid){
//                    return mid;
//                }
            }
            if(temp > mid) end = mid;
            else start = mid+1;
        }
        return end;
    }
}
