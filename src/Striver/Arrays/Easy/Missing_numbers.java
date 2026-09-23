package Striver.Arrays.Easy;

import java.util.Arrays;

public class Missing_numbers {
    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int[] hash = new int[n+1];

        for (int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for (int i=1;i<=n;i++){
            if (hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static int missingNum_using_formula(int[] arr){
        int n = arr.length + 1;
        long sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        long expSum = n * (n + 1) / 2;
        return (int) (expSum - sum);
    }
    static void main() {
        int[] arr = {8,2,4,5,3,7,1};
        System.out.println(missingNum(arr));
        System.out.println(missingNum_using_formula(arr));
    }
}