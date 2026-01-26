package com.harshul.dsa;
import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] c = Reverse(arr);
//        Reverse(arr);
        for( int a : c){
            System.out.println(a);
        }
        for( int a : arr){
            System.out.println(a);
        }
    }
    static int[] Reverse(int[] arr){
        int[] b = Arrays.copyOf(arr, arr.length);
        int start = 0;
        int end = b.length - 1;
        while(start < end){
            Swap(b,start,end);
            start++;
            end--;
        }
        return b;

    }
    static void Swap(int[] arr, int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}

