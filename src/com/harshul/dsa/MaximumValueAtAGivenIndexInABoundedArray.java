package com.harshul.dsa;

import java.util.Arrays;

public class MaximumValueAtAGivenIndexInABoundedArray {
    static void main() {
        System.out.println(ans(2, 6, 10));
    }

    static int ans(int index, int n, int maxSum) {
//        Wrong Brute Approach
//        int su  = n;
//        int x = 0;
//        int ans = Integer.MIN_VALUE;
//        int end = maxSum - n;
//        int start = 1;
//        while(start<=end && arr[index] - x <= arr[index]){
//            int mid = start + (end-start)/2;
//            arr[index]  = mid;
//            su = sum(arr);
//            if(su <= maxSum && check(arr)){
//                if(arr[index] > ans) ans = arr[index];
//                start = mid + 1;
//            }
//            else {
//                if(index == 0){
//                    arr[index+1] = mid - x;
//                }
//                else if ( index == n-1){
//                    arr[index-1] = mid - x;
//                }
//                else {
//                    arr[index-1] = mid - x;
//                    su = sum(arr);
//                    if(su < maxSum ){
//                        arr[index+1] = mid-x;
//                    }
//                    x++;
//                }
//            }
//        }
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            arr[index] = mid;
//        }
//        return ans;
//      Optimal Approach
        int start = 1;
        int end = maxSum - n;
        int temp = 0;
        long x = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long a = left(mid, index) + left(mid, n - 1 - index) + mid;

            if (a == maxSum) {
                return mid;
            } else if (a < maxSum) {
                temp = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return temp;
    }

    static long left(int val, int count) {
        int peak = val - 1;
        long sum = 0;
        if (peak >= count) {
            int smallest = (peak - count + 1);
            sum = (long) count * (smallest + peak) / 2;
        } else {
            long su = (long) peak * (peak + 1) / 2;
            long suM = count - peak;
            sum = su + suM;
        }
        return sum;
    }
}
//    static int right(int val, int index, int maxSum, int n){
//        int peak = val - 1;
//        int count = n - 1 -index;
//        int sum = 0;
//        long x = 0;
//        for(int i = 1; i <= count; i++){
//            if(peak<=1){
//                sum +=  1;
//            }
//            else {
//                sum += peak;
//                peak--;
//            }
//            if(sum > maxSum){
//                break;
//            }
//        }
//        return sum;
//    }
//    static long sum(int[] arr, int maxSum, int index){
//        long n = 0;
//        long m = 0;
//        n = leftSum(arr,maxSum,index);
//        if(n > maxSum){
//            return n;
//        }
//        else if (  n <= maxSum && index != arr.length-1) {
//            m = rightSum(arr,maxSum,index);
//        }
//        return n + m;
//    }
//    static long leftSum(int[] arr,int maxSum, int index){
//        long sum = 0;
//        for(int i = index; i >= 0; i--){
//            sum += arr[i];
//            if(sum > maxSum){
//                break;
//            }
//        }
//        return sum;
//    }
//    static long rightSum(int[] arr,int maxSum, int index){
//        long sum = 0;
//        for(int i = index+1; i < arr.length; i++){
//            sum += arr[i];
//            if(sum > maxSum){
//                break;
//            }
//        }
//        return sum;
//    }
//    static boolean check(int[] arr){
//        boolean a = true;
//        for(int i = 0; i < arr.length-2; i++){
//            if(Math.abs(arr[i]-arr[i+1]) > 1){
//                a = false;
//            }
//        }
//        return a;
//    }
//}
