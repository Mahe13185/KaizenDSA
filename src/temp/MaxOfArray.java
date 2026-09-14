package temp;

public class MaxOfArray {
    static int usingNormal(int[] arr){
    int max = Integer.MIN_VALUE;
        for (int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    int max = Integer.MIN_VALUE;
    static int usingRecurrsion(int[] arr,int n){
        if(n == arr.length - 1) return arr[n];

        return 0;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(usingNormal(arr));
        System.out.println(usingRecurrsion(arr,0));
    }
}
