class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int i =0;
        int n = arr.length;
        int j=n-1;
        int boats = 0;
        Arrays.sort(arr);
        while(i<=j){
            if(arr[i] + arr[j] <= limit){
                i++;
                j--;
            }
            else{
                
                j--;
            }
            boats++;
        }
        return boats;
    }
}