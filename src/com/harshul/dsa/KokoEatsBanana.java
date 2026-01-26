package com.harshul.dsa;



public class KokoEatsBanana {
    static void main() {
        int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(ans(arr,h));
    }
    static int ans(int[] piles, int h){
        long min = 0;
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            if(max<piles[i]){
                max = piles[i];
            }
        }
        long rem = max % h;
        if(rem == 0){
            min = max/h;
        }
        else {
            min = (max + (h - rem)) / h;
        }
        long start = min;
        long end = max;
        int x = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            int temp = h;
            x = 0;
            while(x <= piles.length-1){

                if(temp<0){
                    break;
                }
                if(mid>=piles[x]){
                    temp--;
                }
                if(temp<0){
                    break;
                }
                if(mid<piles[x]){
                    if(piles[x]%mid  == 0){
                        temp -= (int) (piles[x]/mid);
                    }
                    else {
                        temp -= (int) ((piles[x]/mid) + 1);
                    }
                }
                if(temp<0){
                    break;
                }
                x++;
                /*
                better way to do this , this will replace the entire inner loop
                for(int x = 0; x < piles.length; x++){
                    temp = (piles[x] + mid - 1)/mid;
                }
                 */
            }
            if(temp >= 0){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return (int)start;
    }

}
