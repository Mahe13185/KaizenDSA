package Striver.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _3Sum {
    public static List<List<Integer>> threeSum_brute(int[] arr) {
        List<List<Integer>> temp = new ArrayList<>();
        HashSet<List<Integer>> seen = new HashSet<>();
        Arrays.sort(arr);

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for (int k=j+1;k< arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> row = new ArrayList<>();
                        row.add(arr[i]);
                        row.add(arr[j]);
                        row.add(arr[k]);
                        if(seen.add(row))
                            temp.add(row);
                    }
                }
            }
        }
        return temp;
    }
    static List<List<Integer>> threeSum_optimal(int[] arr){
        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int left = i + 1;
            int right = n-1;

            while (left < right){

                int sum = arr[i] + arr[left] + arr[right];

                if(sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
                else {
                    List<Integer> row = new ArrayList<>();
                    row.add(arr[i]);
                    row.add(arr[left]);
                    row.add(arr[right]);

                    temp.add(row);

                    left++;
                    right--;

                    while (left<right && arr[left] == arr[left - 1]) left++;
                    while (left<right && arr[right] == arr[right + 1]) right--;

                }
            }
        }
        return  temp;
    }
    static void main() {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum_brute(arr));
        System.out.println(threeSum_optimal(arr));
    }
}
