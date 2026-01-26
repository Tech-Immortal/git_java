package com.harshul.dsa;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomArrayList {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for( int i = 0; i < 5; i++){
            list.add(n.nextInt());
        }
        System.out.println("over");
        for( int i = 0; i < list.size(); i++){

            System.out.print(list.get(i)+" ");
        }
    }
}
