package com.harshul.dsa;

public class CharacterBianrySearch {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'c';
        char ans = compareChar(letter,target);
        System.out.println(ans);
    }
    static char compareChar(char[] letter, char target){
        int start = 0;
        int end = letter.length - 1;
        if(letter[end] <= target)
            return letter[0];
        while(start <= end){
            int mid = (start+end)/2;
            if(letter[mid] <= target)
                start = mid + 1;
            if(letter[mid] > target)
                end = mid - 1;
        }
        return letter[start];
    }
}
