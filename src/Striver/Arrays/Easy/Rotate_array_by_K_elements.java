package Striver.Arrays.Easy;

public class Rotate_array_by_K_elements {
    static void reverseArray(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end++;
        }
    }
    static int[] rotateArray(int[] arr, int k, String direction){
        int n = arr.length;
         k = k % n;
        if(direction.equals("right")){
            reverseArray(arr,0,n-1);
            reverseArray(arr,0,k-1);
            reverseArray(arr,k,n-1);
        }

        return arr;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;
        int[] solution = Rotate_array_by_K_elements.rotateArray(arr,k,"right");
        for (int num : solution){
            System.out.println(num);
        }
    }
}
