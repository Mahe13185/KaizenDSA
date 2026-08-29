package Striver.Arrays.Easy;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Intersection_of_Two_Arrays {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 4, 4, 5, 7, 8};
//
//        Set<Integer> set = new TreeSet<>();
//        for (int num : arr){
//            set.add(num);
//        }
//        for(int num : arr2){
//            set.add(num);
//        }
//        System.out.println(new ArrayList<>(set));

        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr.length, m = arr2.length;
        while (i < n && j < m) {
            if (arr[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr[i]) {
                    union.add(arr[i]);
                }
                    i++;
            } else if (arr[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                    j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr[i]);
                }
                    j++;
                    i++;
            }
        }
        while (i<n){
            if (union.isEmpty() || union.get(union.size() - 1) != arr[i]){
                union.add(arr[i]);
            }
            i++;
        }
        while (j<m){
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        for (int num : union){
            System.out.print(num);
        }
    }
}