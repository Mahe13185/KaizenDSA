class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int middle = left + (right - left) / 2;
            if(arr[middle] == target) return middle;

            // Checks for left part is sorted or not 
            if(arr[left] <= arr[middle]){
                if(arr[left] <= target && target < arr[middle]){
                    right = middle - 1;
                }
                else{
                    left = middle + 1;
                }
            }else{
                if(arr[middle] < target && target <= arr[right]){
                    left = middle + 1;
                }else{
                    right = middle - 1;
                }
            }
        }
        return -1;
        } 
    }