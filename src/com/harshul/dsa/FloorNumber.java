package com.harshul.dsa;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,2,1};
        int target = 5;
        int b = FloorIndex(arr, target);
        System.out.println(b);
    }
    static int FloorIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return end;
        }
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] > target)
                end = mid - 1;
            if(arr[mid] < target)
                start = mid + 1;
        }
//        if(arr[start] >= target)
        return end;
    }
}


