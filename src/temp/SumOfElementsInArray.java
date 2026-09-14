package temp;

public class SumOfElementsInArray {
    static int usingNormal(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static  int usingRecurrsion(int[] arr, int n){
        if(n == arr.length) return 0;
        return arr[n] + usingRecurrsion(arr,n+1);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(usingNormal(arr));
        System.out.println(usingRecurrsion(arr, 0));
    }
}
