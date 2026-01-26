package com.harshul.dsa;

public class EvenDigitInArray {
    public static void main(String[] args) {
        int[] arr = {23,345,6555,2433};
        System.out.println(findEven(arr));

    }
    static int findEven(int[] arr){
        int noOfNum = 0;
        for(int i = 0; i < arr.length; i++){
            int digit = (int)(Math.log10(arr[i])+1);
//            int num = arr[i];
//            while( num > 0){
//                num = num/10;
//                digit++;
//            }
            if(digit%2 == 0)
                noOfNum++;
        }
        return noOfNum;
    }
}
