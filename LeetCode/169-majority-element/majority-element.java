class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        long highCount = n / 2;
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<n;i++){
            seen.put(arr[i],seen.getOrDefault(arr[i],0) + 1);
            if(seen.get(arr[i]) > highCount){
                return arr[i];
            }
        }
        return -1;
    }
}