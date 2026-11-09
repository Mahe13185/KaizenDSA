package Striver.Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] two_sum(int[] arr, int target){
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(seen.containsKey(compliment)){
                return new int[] {seen.get(compliment) , i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    static void main() {
        int[] arr = {2,7,11,15};
        int n = arr.length;
        int target = 9;

        System.out.println(Arrays.toString(two_sum(arr,target)));
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i =0;i<n;i++){
//            int compliment = target - arr[i];
//            if(map.containsKey(compliment)){
//                System.out.println(map.get(compliment) + " " + i);
//            }
//            map.put(arr[i] , i);
//        }

    }
}
