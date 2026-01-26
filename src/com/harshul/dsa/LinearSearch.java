package com.harshul.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9};
        System.out.println(LinearSearchMethod(arr,8));
    }
    static int LinearSearchMethod(int[] arr, int a){
        if(arr.length == 0)
            return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a)
                return i;
        }
        return Integer.MAX_VALUE;
    }
}
