package Striver.Arrays.Medium;

import java.util.HashMap;

public class TwoSum {
    static void main() {
        int[] arr = {2,7,11,15};
        int n = arr.length;
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                System.out.println(map.get(compliment) + " " + i);
            }
            map.put(arr[i] , i);
        }

    }
}
