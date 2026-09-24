package Striver.Arrays.Easy;

import java.util.HashMap;

public class MajorityElement {
    static void main() {
        int[] arr = {2,2,1,1,1,2,2};
//        int highCount = arr.length/2;
//        HashMap<Integer,Integer> seen = new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//            seen.put(arr[i],seen.getOrDefault(arr[i],0) + 1);
//            if (seen.get(arr[i]) > highCount){
//                System.out.println(arr[i]);
//            }
//        }
//
//        Boyer-Moore
/*
{2,2,1,1,1,2,2};
    candidate count
2       2       1
2       2       2
1       2       1
1       2       0
1       1       1
2       1       0
2       2       1
 */
        int count = 0;
        int candidate = arr[0];
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(arr[i] == candidate){
                count++;
            } else if (arr[i] != candidate) {
                count--;
            }
        }
        System.out.println(candidate);

    }
}
