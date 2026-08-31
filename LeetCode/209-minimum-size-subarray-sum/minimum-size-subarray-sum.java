class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;

        for(int right=0; right < arr.length; right++){
            sum += arr[right];
            while(sum >= target){
                length = Math.min(length, (right - left + 1));
                sum -= arr[left];
                left++;
            }
           
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}