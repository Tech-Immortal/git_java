package com.harshul.dsa;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,6,7};
        int target = 6;
        int c = firstOccuranceIndex(arr, target);
        int d = lastOccuranceIndex(arr, target);
        System.out.println(c);
        System.out.println(d);
    }
    static int firstOccuranceIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
    static int lastOccuranceIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] <= target)
                start = mid;
            else
                end = mid-1;
        }
        return end;
    }
    static int firstOccuranceUsingGreaterNo(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(arr[mid+1]>arr[mid])
                    return mid;
                else
                    start = mid+1;
            }
            if(arr[mid] > target)
                end = mid - 1;
            if(arr[mid] < target)
                start = mid + 1;
        }
        if (arr[start]==target)
            return start;
        else
            return -1;
    }
}
