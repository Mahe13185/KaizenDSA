class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
//         int i = 0;
//         int n = arr.length;
//         int j = n - 1;
//         Arrays.sort(arr);
//         while(i < j){
//         if(arr[i] + arr[j] > target){
//             j--;
//         }
//         else if(arr[i] + arr[j] < target){
//             i++;
//         }
//         else if(arr[i] + arr[j] == target){
//             return new int[] {i,j};
//         }
//     }
//             return new int[] {-1,-1};
// }
    }
}