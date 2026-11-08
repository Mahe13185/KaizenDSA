package LeetCode_75.Hashmap_set;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int ele : arr){
            seen.put(ele, seen.getOrDefault(ele,0) + 1);
        }
        HashSet<Integer> check = new HashSet<>();

        for (int count : seen.values()){
            if(!check.add(count))
                return false;
        }
        return true;
    }

    static void main() {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
