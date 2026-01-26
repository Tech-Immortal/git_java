package com.harshul.dsa;

public class CelingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9};
        int target = 3;
        int b = CeilingIndex(arr, target);
        System.out.println(b);
    }
    static int CeilingIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1;
        }
//        if(arr[start] >= target)
            return start;
    }
}

