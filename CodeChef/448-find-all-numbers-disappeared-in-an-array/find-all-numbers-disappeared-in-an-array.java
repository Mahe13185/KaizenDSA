class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num : nums){
            numbers.add(num);
        }
        for(int i = 1;i <= nums.length; i++){
            if(!numbers.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}