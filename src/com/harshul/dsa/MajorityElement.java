package com.harshul.dsa;

public class MajorityElement {
    static void main() {
        int[] arr = {6,5,5};
        int a = compare(0,arr);
        System.out.println(a);
    }
    static int ans(int[] nums){
//        for(int i = 0; i < nums.length; i++){
//            int count = 0;
//            for(int j = 0; j < nums.length; j++){
//                if(nums[i] == nums[j]){
//                    count++;
//                }
//                if(count > nums.length/2){
//                    return nums[i];
//                }
//            }
//        }
//        return -1;

        int a = compare(0,nums);
        return a;

    }
    static int compare(int x, int[] nums){
        int count = 0;
        for (int num : nums) {
            if (nums[x] == num) {
                count++;
            }
            if (count > nums.length / 2) {
                return nums[x];
            }
        }
        return  compare(x+1,nums);
    }
}
