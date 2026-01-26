package com.harshul.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Spiral {
    static void main() {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralAns(arr));

    }
    static List<Integer> spiralAns(int[][] matrix){
        int a = matrix.length;
        int b = matrix[0].length;
        ArrayList<Integer> ls = new ArrayList<>(a * b);

        int rightBoundary = b - 1;
        int leftBoundary = 0;
        int lowerBoundary = a - 1;
        int upperBoundary = 1;
        int you = 0;
        int me = 0;
        int bcount = 0;
        int count = 0;
        while (count!=a*b) {
            for (int j = me; j <= rightBoundary; j++) {
                ls.add(matrix[you][j]);
                count++;
                if (count==a*b) {
                    bcount++;
                    break;
                }
            }
            if(bcount!=0){
                break;
            }
            int t = rightBoundary;
            rightBoundary--;
            for (int j = b - t; j <= lowerBoundary; j++) {
                ls.add(matrix[j][t]);
                count++;
                if (count==a*b) {
                    bcount++;
                    break;
                }
            }
            if(bcount!=0){
                break;
            }
            int x = lowerBoundary;
            lowerBoundary--;
            for (int j = t - 1; j >= leftBoundary; j--) {
                ls.add(matrix[x][j]);
                count++;
                if (count==a*b) {
                    bcount++;
                    break;
                }
            }
            if(bcount!=0){
                break;
            }
            int y = leftBoundary;
            leftBoundary++;
            for (int j = x - 1; j >= upperBoundary; j--) {
                ls.add(matrix[j][upperBoundary - 1]);
                count++;
                if (count==a*b) {
                    bcount++;
                    break;
                }
            }
            if(bcount!=0){
                break;
            }
            upperBoundary++;
            you++;
            me++;
        }
        return ls;
    }
}
