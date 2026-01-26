package com.harshul.dsa;

public class SearchInRotatedArray {
    void main(){
        int[] arr = {4,5,6,6,7,0,1,2};
        int a = 1;
        int b = search(arr,a);
        System.out.println(b);
    }
    static int search(int[] nums, int target){
        int x = separatingPoint(nums);
        int separate = nums.length - x;
        if(x == 0) {
            int a = searchElement(nums, target, 0, nums.length - 1);
            return a;
        }
        else  {
            int y = searchElement(nums,target,0,x-1);
                if(y == -1){
                    int z = searchElement(nums,target,x,nums.length-1);
                    return z;
                }
                else
                    return y;
        }
    }
    static int separatingPoint(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[end])
                start = mid+1;
            else
                end = mid;
        }
        return start;
    }
    static int searchElement(int[] arr, int target, int a, int b){
        int start = a;
        int end = b;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
