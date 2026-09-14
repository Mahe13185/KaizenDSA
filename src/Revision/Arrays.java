package Revision;

public class Arrays {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int ele : arr){
            if(ele > max) max = ele;
        }
        return max;
    }
    static int findMin(int[] arr){
        int max = Integer.MAX_VALUE;
        for (int ele : arr){
            if(ele < max) max = ele;
        }
        return max;
    }
    static int findSum(int[] arr){
        int max = 0;
        for (int ele : arr){
            max += ele;
        }
        return max;
    }
    static int findSecoundMax(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int ele : arr){
            if(ele > largest){
                secondlargest = largest;
                largest = ele;
            } else if (ele > secondlargest  && ele < largest) {
                secondlargest = ele;
            }
        }
        return secondlargest;
    }
    static int findSecondMin(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int ele : arr){
            if(ele < smallest){
                secondSmallest = smallest;
                smallest = ele;
            } else if (ele > smallest && ele < secondSmallest) {
                secondSmallest = ele;
            }
        }
        return secondSmallest;
    }
    static int[] roateArray(int[] arr,int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] rotateArrayBy_N(int[] arr, int k, String direction){
        k = k % arr.length;
        if (direction.equals("right")){
            roateArray(arr,0, arr.length-1);
            roateArray(arr,0,k-1);
            roateArray(arr,k, arr.length-1);
        }
        if (direction.equals("left")){
            roateArray(arr,0,k-1);
            roateArray(arr,k,arr.length-1);
            roateArray(arr,0, arr.length-1);
        }
        return arr;
    }

    static void main() {
        int[] arr = {4,7,2,9,1};
        int[] arr1 = {1,2,3,4,5,6,7,8};

        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(findSum(arr));
        System.out.println(findSecoundMax(arr));
        System.out.println(findSecondMin(arr));
        System.out.println(java.util.Arrays.toString(rotateArrayBy_N(arr1,3,"right")));
        System.out.println(java.util.Arrays.toString(rotateArrayBy_N(arr1,3,"left")));

    }
}
