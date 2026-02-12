package com.harshul.dsa;

public class ReachATarget {
    static void main() {
        int k = 5;
//        int a = ans(k);
//        int b = ans2(k);
//        if( a > b){
//            System.out.println(b);
//        }
//        else {
//            System.out.println(a);
//        }
        System.out.println(sol(k));
    }
    static int ans(int target){
        int i = 1;
        int num = 0;
        if( target > 0) {
            while (num != target) {
                if (num + i == target) {
                    break;
                } else if (num + i < target) {
                    num += i;
                } else {
                    num -= i;
                }
                i++;
            }
        }
        else {
            while (num != target) {
                if (num - i == target) {
                    break;
                } else if (num - i > target) {
                    num -= i;
                } else {
                    num += i;
                }
                i++;
            }
        }
        return i;
    }

    static int ans2(int  target){
        int j = 0;
        int k = 0;
        if( target > 0){
             j = 2;
             k = -1;
            while(k != target){
                if(k + j == target){
                    break;
                }
                if(k + j < target){
                    k += j;
                    j++;
                }
                else {
                    k -= j;
                    j++;
                }
            }
        }
        else {
            j = 2;
            k = 1;
            while( k != target){
                if( k - j == target){
                    break;
                }
                if( k - j > target){
                    k -=j;
                    j++;
                }
                else {
                    k += j;
                    j++;
                }
            }
        }
        return j;
    }
    // By the method of sum and parity check ( heck what does parity mean here ) ohh it means equality in english and here in mathematics it means the property of a number to be odd or even .
    static int sol(int target){
        int k = Math.abs(target);
        int steps = 0;
        int sum = 0;
        while(true){
            steps++;
            sum += steps;
            if((sum-target)%2 == 0 && sum >= target) break;
        }
        return steps;
    }
}
