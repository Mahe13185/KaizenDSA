class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        // Set<Integer> seen = new HashSet<>();
        // for (int i=0;i< nums1.length;i++){
        //     for (int j=0;j< nums2.length;j++){
        //         if(nums1[i] == nums2[j]){
        //             seen.add(nums1[i]);
        //         }
        //     }
        // }
        // int[] res = new int[seen.size()];
        // int index =0;

        // for (int ele : seen){
        //     res[index] = ele;
        //     index++;
        // }
        // return res;

         HashSet<Integer> seen = new HashSet<>();
        for (int ele : arr1){
            seen.add(ele);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int i=0;i<arr2.length;i++){
            if (seen.contains(arr2[i])){
              res.add(arr2[i]);
            }
        }
        int index =0;
        int[] arr = new int[res.size()];
        for(int ele : res){
            arr[index] = ele;
            index++;
        }
        return arr;
    }
    }
