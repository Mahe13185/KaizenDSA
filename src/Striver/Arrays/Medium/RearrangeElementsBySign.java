package Striver.Arrays.Medium;

import java.util.Arrays;

public class RearrangeElementsBySign {
    static void main() {
        int[] arr = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        int[] new_arr = new int[n];

        for (int i=0;i<n;i++){
            if(arr[i] > 0){
                new_arr[pos] = arr[i];
                pos += 2;
            }
            else {
                new_arr[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
