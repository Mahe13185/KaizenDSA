package Striver.Hashing;

import java.util.HashMap;

public class HighestOccurringElementinanArray {
    public static int mostFrequentElement(int[] arr) {
       HashMap<Integer, Integer> seen = new HashMap<>();

       for (int i=0;i<arr.length;i++){
           if (!seen.containsKey(arr[i])){
               seen.put(arr[i],1);
           }else
               seen.put(arr[i],seen.get(arr[i]) + 1);
       }
       int max = 0;
       int ans = 0;
       for (int ele : seen.keySet()){
           if (seen.get(ele) > max){
               max = seen.get(ele);
               ans = ele;
           }
       }
       return  ans;

    }

    static void main() {
        int[] arr = {1, 2, 2, 3, 3, 3,3};
        System.out.println(mostFrequentElement(arr));
    }
}
