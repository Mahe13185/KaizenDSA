package Striver.Arrays.Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInArray {
    static void main() {
        int[] arr = {1, 2, 5, 3, 1, 2};
        int n = arr.length;
        ArrayList<Integer> leader = new ArrayList<>();
// bruteforce
//        for (int i=0;i<n;i++){
//            boolean isLeader = true;
//            for (int j=i+1;j<n;j++){
//                if (arr[j] > arr[i]){
//                    isLeader = false;
//                    break;
//                }
//            }
//                if (isLeader){
//                    leader.add(arr[i]);
//                }
//        }
//        System.out.println(leader);

//        optimal

        int largest = Integer.MIN_VALUE;
        for (int i= n-1;i>=0;i--){
            if(arr[i] > largest){
                leader.add(arr[i]);
                largest= arr[i];
            }
        }
        Collections.reverse(leader);
        System.out.println(leader);
    }
}
