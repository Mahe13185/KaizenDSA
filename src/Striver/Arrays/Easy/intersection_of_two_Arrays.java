package Striver.Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class intersection_of_two_Arrays {
    public static int[] solution_brute(int[] nums1,int[] nums2){
        Set<Integer> seen = new HashSet<>();
        for (int i=0;i< nums1.length;i++){
            for (int j=0;j< nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    seen.add(nums1[i]);
                }
            }
        }
        int[] res = new int[seen.size()];
        int index =0;

        for (int ele : seen){
            res[index] = ele;
            index++;
        }
        return res;
    }

    public static HashSet<Integer> solution_optimal(int[] arr1, int[] arr2){
        HashSet<Integer> seen = new HashSet<>();
        for (int ele : arr1){
            seen.add(ele);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int i=0;i<arr2.length;i++){
            if (seen.contains(arr2[i])){
              res.add(arr2[i]);
            }
        }
        return res;
    }
    static void main() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(solution_brute(nums1, nums2)));
        System.out.println(Arrays.toString(solution_brute(nums1, nums2)));
    }
}
