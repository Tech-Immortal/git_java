package com.harshul.dsa;

import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String  b = sc.nextLine();
        System.out.println("enter the word to search for: ");
        String target = sc.nextLine();
        boolean x = searchWords(b,target);
        System.out.println("does the string contain the word: " + x);
//        System.out.println("enter the letter to search: ");
//        char c = sc.next().charAt(0);
//        boolean a = searchLetters(b,c);
//        System.out.println("does the string contain the letter: " + a);
    }
    static boolean searchLetters(String s, char t){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t)
                return true;
        }
        return false;
    }
    static boolean searchWords(String s, String t){
        String[] str = s.trim().split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(t)){
                return true;
            }
        }
        return false;
    }
}
