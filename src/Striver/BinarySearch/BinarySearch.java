package Striver.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    static int solution(int[] arr , int key){
        int n = arr.length;
        int left = 0,right = n-1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(key == arr[middle]) return  middle;
            else if (arr[middle] > key) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {3,4,2,3,8,21,12};
        Arrays.sort(arr);
        int key = 4;
        System.out.println(BinarySearch.solution(arr,key));
    }
}
