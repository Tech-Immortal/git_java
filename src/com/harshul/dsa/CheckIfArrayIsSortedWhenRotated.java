package com.harshul.dsa;

import java.util.Arrays;

public class CheckIfArrayIsSortedWhenRotated {
    public static void main() {
        int[] arr = {6,10,6};
//        boolean a = ans(arr);
//        System.out.println(a);
          boolean a = solm(arr);
        System.out.println(a);
    }

    static boolean ans(int[] nums) {
        boolean c = false;
        int temp = 0;
        for (int x = 0; x <= nums.length - 1; x++) {
            int[] num = new int[nums.length];
            int count = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                int con = (i + x) % nums.length;
                num[con] = nums[i];
                if (con != 0 && num[con] < num[con - 1] && i != 0) {
                    count++;
                    break;
                }
                if (count == 0 && num[nums.length - 2] < num[nums.length - 1]) {
                    if(con!= num.length-1 && num[con]<num[con+1])
                        return true;
                }
            }
        }
        return c;
    }
    static boolean check(int[] nums){
        boolean c = false;
        if(nums.length == 1)
            return true;
        for(int x = 1; x < nums.length; x++){
            int[] num = nums.clone();
            int[] crr = rotate(num,x);
            c = checkIfSorted(crr);
            if(c)
                return c;
        }
        return c;
    }
    static int[] rotate(int[] arr, int i){
        int temp;
        temp = arr[0];
        for(int j = 0; j < arr.length-1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length-1] = temp;
        i--;
        if(i==0)
            return arr;
        else
            return rotate(arr,i);
    }
    static boolean checkIfSorted(int[] arr){
        int a = arr[0];
        for(int i  = 1; i < arr.length; i++){
            if(a>arr[i])
                return false;
            else
                a = arr[i];
        }
        return true;
    }
    static int smallestElement(int[] arr){
        int a = arr[0];
        for(int i = 1; i < arr.length; i++){
            if( a > arr[i])
                a = arr[i];
        }
        return a;
    }
    static int largestElement(int[] arr){
        int a = arr[0];
        for(int i = 1; i < arr.length; i++){
            if( a < arr[i])
                a = arr[i];
        }
        return a;
    }
    static boolean solm(int[] nums){
        int a = smallestElement(nums);
        int b = largestElement(nums);
        boolean c = false;
        for(int x = 1; x < nums.length; x++){
            int[] num = nums.clone();
            int[] crr = rotate(num,x);
            if (crr[0] == a && crr[nums.length-1] == b) {
                c = checkIfSorted(crr);
            }
            if(c)
                return c;
        }
        return c;
    }
}
//i = 1,    rotate(i)
//          checkIfSorted(arr)
//          if(b == true) return true
//          return false
//sort hai ki nahi check karega