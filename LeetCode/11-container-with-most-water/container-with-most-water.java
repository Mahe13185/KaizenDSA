class Solution {
    public int maxArea(int[] arr) {
         int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int height = Math.min(arr[left], arr[right]);

            int currentArea = width * height;

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            // Move the shorter line
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}