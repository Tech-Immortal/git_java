package com.harshul.dsa;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sum();
        System.out.println("hi");
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int i = sc.nextInt();
        System.out.println("Enter the com.harshul.dsa.second no: ");
        int j = sc.nextInt();
        int sum = i + j;
        System.out.println("sum is "+ sum);
        System.out.println("Do you want another summation [y/n]: ");
        char k = sc.next().charAt(0);
        if( k == 'y'){
            sum();
        }
    }
}