class Solution {
    public int maxProfit(int[] arr) {
        int min_price = arr[0];
        int n = arr.length;
        int profit = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < min_price){
                min_price = arr[i];
            }
            int curr_profit = arr[i] - min_price;
            if(curr_profit > profit){
                profit = curr_profit;
            }
        }
        return profit;
    }
}