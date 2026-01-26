package com.harshul.dsa;

public class PeakProblem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int a = PeakSearch(arr);
        System.out.println(a);
    }
    static int PeakSearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 1)
            return 0;
        while(start < end){
            int mid = (start + end)/2;
//            if(mid == 0){
//                if(arr[mid] > arr[mid+1])
//                    return mid;
//                else
//                    return  mid+1;
//            }
//            if(mid == arr.length -1){
//                if(arr[mid]>arr[mid-1])
//                    return mid;
//            }
//            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
//                return mid;
//            if(arr[mid] < arr[mid+1])
//                start = mid + 1;
//            if(arr[mid] > arr[mid+1])
//                end = mid - 1;
            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }
}
//int start = 0;
//int  end = arr.length - 1;
//        if(arr.length == 0)
//        return 0;
//        while(start <= end){
//int mid = (start + end)/2;
//            if(mid == 0){
//        if(arr[mid] > arr[mid+1])
//        return mid;
//            }
//                    if(mid == arr.length -1){
//        if(arr[mid]>arr[mid-1])
//        return mid;
//            }
//                    if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
//        return mid;
//            if(arr[mid] < arr[mid+1])
//start = mid + 1;
//        if(arr[mid] > arr[mid+1])
//end = mid - 1;
////            if(start == end)
////                return start;
//        }
//        return -1;