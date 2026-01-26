package com.harshul.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class RoataingByRightPlaces {
    static void main() {
        int[] nums = {1,2,3,4,5,6,7};
        int[] num = new int[nums.length];
        System.arraycopy(nums, 0, num, 0, nums.length);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Arrays.toString(sol(nums, a)));
        System.out.println(Arrays.toString(solForLeftPlaces(num, a)));
    }
    static void rotate(int[] nums, int k){
        if(nums.length == 1 || k == 0)
            System.out.println(Arrays.toString(nums));
        else {
            int[] bums = ans(nums, k);
            System.out.println(Arrays.toString(bums));
        }
    }
    static int[] ans(int[] nums,int k){
        int temp = nums[nums.length-1];
        while(k!=0) {
            for (int i = 0; i <= nums.length - 2; i++) {
                nums[nums.length - 1 - i] = nums[nums.length - i - 2];
            }
            nums[0] = temp;
            k--;
        }
        return nums;
//        if(k==0)
//            return nums;
//        else
//            return ans(nums,k);
    }
    // Another better way of rotating right places
    static int[] sol(int[] arr, int noOfPlaces){
        reverse(arr,0,arr.length-1-noOfPlaces);
        reverse(arr,arr.length-noOfPlaces, arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }
    static int[] reverse(int[] arr, int start, int end){
        int  temp;
        while(start<end){
            for(int i = start; i <= end; i++){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
    // Another better way of rotating left places
    static int[] solForLeftPlaces(int[] arr, int noOfPlaces){

        reverse(arr,0,noOfPlaces-1);
        reverse(arr, noOfPlaces+1-1, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;

    }

}
