package com.harshul.dsa;

public class SingleNumber {
    static void main() {
        int[] arr = {2,2,1};
        System.out.println(ans(arr));
    }
    static int ans(int[] nums){
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}

