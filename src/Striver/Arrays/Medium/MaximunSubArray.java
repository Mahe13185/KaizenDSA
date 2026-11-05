package Striver.Arrays.Medium;

public class MaximunSubArray {
    static int solution(int[] arr){
        int n = arr.length;
        int largest = 0;
        for (int i=0;i<n;i++){
            int sum =0;
            for (int j=i;j<n;j++){
                sum += arr[j];
                if(sum > largest)
                    largest = sum;
            }
        }
        return largest;
    }
    static int solution_optimal_kadanes(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int sum =0;
        for (int i=0;i<n;i++){
            sum = Math.max(arr[i] , arr[i] + sum);
            if (sum > largest)
                largest = sum;
        }
        return largest;
    }

    static void main() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(arr));
        System.out.println(solution_optimal_kadanes(arr));
    }
}
