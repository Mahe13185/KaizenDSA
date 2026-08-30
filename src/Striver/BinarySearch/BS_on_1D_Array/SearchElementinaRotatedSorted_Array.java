package Striver.BinarySearch.BS_on_1D_Array;

public class SearchElementinaRotatedSorted_Array {
    static int solution(int[] arr , int target){
        int left = 0;
        int right = arr.length - 1;

        while (left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return  mid;

            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            }else {
                if(arr[mid] < target && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }

        return -1;
    }

    static void main() {
        int[] arr = {6,7,8,9,1,2,3};
        int result = SearchElementinaRotatedSorted_Array.solution(arr , 3);
        System.out.println(result);
    }
}
