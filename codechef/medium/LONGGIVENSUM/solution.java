class Solution {
    public int longestSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int length = 0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
}