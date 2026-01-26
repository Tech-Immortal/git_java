package com.harshul.dsa;

public class FindInMountainArray {
    public static void main() {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;
        int b = ans(arr,target);
        System.out.println(b);
    }
    static int ans(int[] mountainArr, int target) {
        int a = peakElement(mountainArr);
        int leftAnsIndex = leftBinarySearch(mountainArr, a, target);
        int rightAnsIndex = rightBinarySearch(mountainArr, a, target);
        if (leftAnsIndex == -1 && rightAnsIndex == -1)
            return -1;
        else if (leftAnsIndex >= 0 && rightAnsIndex >= 0) {
            if (leftAnsIndex < rightAnsIndex)
                return leftAnsIndex;
            else if (rightAnsIndex < leftAnsIndex)
                return rightAnsIndex;
            else
                return leftAnsIndex;
        } else if (leftAnsIndex >= 0 && rightAnsIndex == -1)
            return leftAnsIndex;
        else
            return rightAnsIndex;
    }
    static int peakElement(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        while ( start < end){
            int mid = start + (end-start)/2;
            if(mountainArr[mid] < mountainArr[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
    static int leftBinarySearch(int[] mountainArr, int end, int target){
        int start = 0;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mountainArr[mid]==target)
                return mid;
            else if(mountainArr[mid]> target){
                end = mid-1;
            }
            else
                start = mid + 1;
        }
        return -1;
    }
    static int rightBinarySearch(int[] mountainArr, int start, int target){
        int end = mountainArr.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mountainArr[mid]==target)
                return mid;
            else if(mountainArr[mid]> target){
               start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return -1;
    }
}

