class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
    
        // for(int i=0;i<n;i++){
        // int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         if(sum > largest)
        //             largest = sum;
        //     }
        // }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = Math.max(arr[i], sum + arr[i]);
            if(sum > largest)
                largest = sum;
        }

        return largest;
    }
}