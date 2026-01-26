package com.harshul.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println("This is the array:");
//        System.out.println(Arrays.toString(arr));
//        System.out.print("enter the target: ");
//        int target = sc.nextInt();
//        int b = binarySearchForAscending(arr, target);
//        System.out.println("the no. is at index: "+ b);


        int[] arr2 = {5,4,3,2,1};
        System.out.println("This is the array:");
        System.out.println(Arrays.toString(arr2));
        System.out.print("enter the target: ");
        int target1 = sc.nextInt();
        int b1 = binarySearchForSortedArray(arr2, target1);
        System.out.println("the no. is at index: "+ b1);


    }
    static int binarySearchForSortedArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if(arr[start] < arr[end])
            isAsc = true;
        else
            isAsc = false;
        if(isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;  // this is done to avoid int exceeding it's range (it's the same thing)
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
            }
        }
        else{
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (arr[mid] == target)
                        return mid;
                    if (arr[mid] < target) {
                        end = mid - 1;
                    }
                    if (arr[mid] > target) {
                        start = mid + 1;
                    }
                }
            }

        return -1;
    }
    static int binarySearchForDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] < target){
                end = mid -1;
            }
            if(arr[mid] > target){
                start = mid + 1;
            }
        }
        return -1;
    }
}