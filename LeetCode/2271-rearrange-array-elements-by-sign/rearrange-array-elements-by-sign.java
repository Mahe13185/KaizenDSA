class Solution {
    public int[] rearrangeArray(int[] arr) {
        int neg = 1;
        int pos = 0;
        int n = arr.length;
        int[] new_arr = new int[n];

        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                new_arr[pos] = arr[i];
                pos += 2;
            }else{
                new_arr[neg] = arr[i];
                neg += 2;
            }
        }
        return new_arr;
    }
}