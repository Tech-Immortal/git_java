package com.harshul.dsa;

public class FindingElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int  a = ans(arr,15);
        System.out.println(a);
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return searchInInfiniteArray(arr,target,start,end);
    }
    static int searchInInfiniteArray(int[] arr, int target, int start, int end){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return mid;
                else if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        return -1;
    }
}