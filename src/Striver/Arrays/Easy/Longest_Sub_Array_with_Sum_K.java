package Striver.Arrays.Easy;

public class Longest_Sub_Array_with_Sum_K {
    static  int solution_bruteforce(int[] arr ,int  target){
        int length = 0;
        for (int i=0;i<arr.length;i++){
                int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == target) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }

    static int solution_optimal(int[] arr, int target){
        int left = 0;
        int sum = 0;
        int length = 0;

        for(int right =0;right<arr.length;right++){
            sum += arr[right];
            while (sum > target){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                length = Math.max(length, (right - left + 1));
            }
        }
        return length;
    }
    static void main() {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(Longest_Sub_Array_with_Sum_K.solution_bruteforce(arr,3));
        System.out.println(Longest_Sub_Array_with_Sum_K.solution_optimal(arr,3));
    }
}
