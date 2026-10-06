class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                return true;
            }else{
                seen.add(arr[i]);

            }
        }
return false;

        // Arrays.sort(arr);
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i] == arr[i-1])
        //         return true;
        // }
        // return false;
    }
}