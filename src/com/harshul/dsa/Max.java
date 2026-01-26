package com.harshul.dsa;

public class Max {
    public static void main(String[] args) {
        int[] arr = {3,4,16,2,87};
        max(arr);
        min(arr);

    }
    static void max(int[] arr){
        int maximum = arr[0];
        for ( int i = 1; i < arr.length; i++){

            if ( maximum < arr[i] ){
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
    static void min(int[] arr){
        int minimum = arr[0];
        for( int i = 1; i < arr.length; i++){
            if(minimum > arr[i])
                minimum = arr[i];
        }
        System.out.println(minimum);
    }
}
