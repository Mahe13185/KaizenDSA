class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> temp = new ArrayList<>();
        HashSet<List<Integer>> seen = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left = i+1;
            int right = arr.length - 1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum > 0)
                    right--;
                else if(sum < 0)
                    left++;
                else{
                    List<Integer> row = new ArrayList<>();
                    row.add(arr[i]);
                    row.add(arr[left]);
                    row.add(arr[right]);

                    left++;
                    right--;
                    if(seen.add(row))
                        temp.add(row);
                }
            }
        }










        // HashSet<List<Integer>> seen = new HashSet<>();

        // for (int i=0;i< arr.length;i++){
        //     for (int j=i+1;j< arr.length;j++){
        //         for (int k=j+1;k< arr.length;k++){
        //             if (arr[i] + arr[j] + arr[k] == 0){
        //                 List<Integer> row = new ArrayList<>();
        //                 row.add(arr[i]);
        //                 row.add(arr[j]);
        //                 row.add(arr[k]);
        //                 Collections.sort(row);

        //                 if(seen.add(row))
        //                     temp.add(row);
        //             }
        //         }
        //     }
        // }
        return temp;
    }
}