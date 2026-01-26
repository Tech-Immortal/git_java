package com.harshul.dsa;

import java.util.Arrays;

public class SortColors {
    static void main() {
        int[] arr = {2,0,2,1,1,0};
        ans(arr);
    }
    static void ans(int[] nums){
        int[] arr2 = new int[nums.length];
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                countZero++;
        }
        temp = countZero;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                countOne++;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2)
                countTwo++;
        }
        while(countZero!=0){
            arr2[countZero-1] = 0;
            countZero--;
        }
        int a = temp+(countOne-1);
        for(int i = temp; i <= a; i++ ){
            arr2[i] = 1;
        }
        if(countOne != 0 && countTwo!= 0){
            for(int i = a+1; i <= a + countTwo; i++){
                arr2[i] = 2;
            }
        }
        else if (temp == 0 && countOne == 0 && countTwo != 0){
            for(int i = 0; i < countTwo; i++){
                arr2[i] = 2;
            }
        }
        else if ( temp != 0 && countOne == 0 && countTwo != 0){
            for(int i = temp; i < temp+countTwo; i++){
                arr2[i] = 2;
            }
        }
        System.out.println(Arrays.toString(arr2).replace(", ",","));
    }
}
