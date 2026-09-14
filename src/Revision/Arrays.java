package Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
    static int[] makeZeros(int[] arr){
        int index = 0;
        for (int j =0;j<arr.length;j++){
            if(arr[j] != 0){
                arr[index] = arr[j];
                index++;
            }
        }
        for (int i =index;i<arr.length;i++){
            arr[i]= 0;
        }
        return arr;
    }

    static boolean unionOfTwoSortedArray(int[] arr, int[] arr1){
//        Set<Integer> set = new TreeSet<>();
//        for (int ele : arr)
//            set.add(ele);
//        for (int ele : arr1) set.add(ele);
//        System.out.println(set);
//        return false;
        int n = arr.length;
        int m = arr1.length;
        List<Integer> union = new ArrayList<>();
        int i = 0, j=0;
        while (i< n && j<m){
            if (arr[i] < arr[j]){
                if (union.isEmpty() || union.get(union.size()-1) != arr[i]){
                    union.add(arr[i]);
                }
                i++;
            }else if (arr[i] > arr[j]){
                if (union.isEmpty() || union.get(union.size()-1) != arr[j]){
                    union.add(arr[j]);
                }
                j++;
            }else {
                if (union.isEmpty() || union.get(union.size()-1) != arr[i]){
                    union.add(arr[i]);
                }
                i++;
                j++;
            }
        }
        while (i<n){
            if (union.isEmpty() || union.get(union.size()-1) != arr[i]){
                union.add(arr[i]);
            }
            i++;
        }
        while (j<m){
            if (union.isEmpty() || union.get(union.size()-1) != arr[j]){
                union.add(arr[j]);
            }
            j++;
        }
        System.out.println(union);
        return false;
    }
    static int[] twoSum(int[] arr , int target){
//        HashMap<Integer,Integer> set = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//           int compliment = target - arr[i];
//           if (set.containsKey(compliment)){
//               return new int[]{set.get(compliment),i};
//           }
//           set.put(arr[i],i);
//        }
//        return new int[]{-1,-1};

        int i =0;
        int j = arr.length - 1;
        while (i<j){
            if(arr[i] + arr[j] > target){
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] == target) {
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static void main() {
        int[] arr = {4,7,2,9,1};
        int[] arr1 = {1,2,3,4,5,6,7,8};

        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(findSum(arr));
        System.out.println(findSecoundMax(arr));
        System.out.println(findSecondMin(arr));

        int[] arr112 = {1,2,3,4,5,6,7,8};
        System.out.println(java.util.Arrays.toString(rotateArrayBy_N(arr112,3,"right")));
        int[] arr2 = {1,2,3,4,5,6,7,8};
        System.out.println(java.util.Arrays.toString(rotateArrayBy_N(arr1,3,"left")));

        int[] arr3 = {0,1,0,3,12};
        System.out.println(java.util.Arrays.toString(makeZeros(arr3)));

        System.out.println(unionOfTwoSortedArray(arr112,arr3));

        int[] arr123 = {2, 7, 11, 15};
        System.out.println(java.util.Arrays.toString(twoSum(arr123, 9)));


        String str = new String("HelloWorld");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
