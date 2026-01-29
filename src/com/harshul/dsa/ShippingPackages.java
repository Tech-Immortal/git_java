package com.harshul.dsa;

public class ShippingPackages {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 5;
        System.out.println(ans(arr,k));
    }
    static int ans(int[] weights, int days){
        int start = 0;
        int end = 0;
        for(int i = 0; i < weights.length; i++){
            end += weights[i];
        }
        while (start<=end){
            int mid = start + (end-start)/2;
            int temp = days;
            int x = 0;
            int sum = 0;
            while (x <= weights.length-1){
//                if(sum < mid){
//                    sum += weights[x];
//                    if(sum < mid){
//                        x++;
//                    }
//                }
//                if(sum >= mid){
//                    temp--;
//                    sum = 0;
//                }
//                if(temp<0){
//                    break;
//                }

                sum += weights[x];
                if(sum < mid){
                    x++;
                }
                if(sum >= mid){
                    temp--;
                    sum = 0;
                }
                if(temp <= 0){
                    break;
                }

            }
            if(temp <= 0){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
}
