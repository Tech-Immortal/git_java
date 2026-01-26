package com.harshul.dsa;

import java.util.Scanner;

public class MathsMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "hello";
        System.out.println(name.toString());

//        System.out.println("Enter the no to check for prime: ");
//        int num = sc.nextInt();
//        boolean c = isPrime(num);
//        if( c == true){
//            System.out.println("The "+num+" is Prime ");
//        }
//        else System.out.println("The "+num+" is not Prime ");
//        printAll3digitArmstrongNumber();
    }
//    static boolean isPrime(int a){
//        if( a == 0 || a == 1){
//            return false;
//        }
//        for(int i = 2; i*i <= a; i++){
//            if(a % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    static void printAll3digitArmstrongNumber(){
//        for( int i = 100; i <= 999; i++){
//            int rem = 0;
//            int sum = 0;
//            int a = i;
//            for (int j = 1; j <= 3; j++) {
//
//                rem = a % 10;
//                a = a/10;
//                sum = sum + (rem * rem * rem);
//            }
//            if(sum == i){
//                System.out.println(sum+" is Armstrong number");
//            }
//        }
//    }
//    static int reverseANumber(int a, int num){
//        int rem = 0;
//        int sum = 0;
//        for(int i = 1; i <= num; i++) {
//            rem = num % 10;
//            sum = sum + rem;
//        }
//    }
}
