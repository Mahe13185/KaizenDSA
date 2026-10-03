package temp.Leetcode.SlidingWindow;

import static java.lang.Math.min;

public class ContainerWithMostWater {
        public static int maxArea(int[] arr) {
            int n = arr.length;
            int left = 0;
            int right = arr.length - 1;
            int highest = 0;

            for(int i=0;i<n;i++){
                for(int j=n-1;j>=0;j--){
                    int width = j - i;
                    int height = min(arr[i],arr[j]);
                    int present_area = width * height;
                    if(present_area > highest){
                        highest = present_area;
                    }
                }
            }
        return highest;
    }
    static int maxArea_optimal(int[] arr){
            int left = 0;
            int right = arr.length - 1;
            int max_area = 0;

            while (left < right){
                int width = right - left;
                int height = Math.min(arr[right],arr[left]);
                int area = width * height;

                if (area > max_area){
                    max_area = area;
                }

                if(arr[left] < arr[right]){
                    left++;
                }else {
                    right--;
                }
            }
            return max_area;
    }

    static void main() {
            int[] arr = {1,8,6,2,5,4,8,3,7};


        System.out.println(maxArea(arr));
        System.out.println(maxArea_optimal(arr));

    }
}
