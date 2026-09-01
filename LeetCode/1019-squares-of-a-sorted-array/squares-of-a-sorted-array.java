class Solution {
    public int[] sortedSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1 ;
        int[] newarr = new int[arr.length];
        int index = arr.length - 1;

        while(left <= right){
            int leftsqrt = arr[left] * arr[left];
            int rightsqrt = arr[right] * arr[right];
            
            if(leftsqrt < rightsqrt){
                newarr[index] = rightsqrt;
                right--;
                index--;
            }
            else{
                newarr[index] = leftsqrt;
                left++;
                index--;
            }
        }
        return newarr;
    }
}