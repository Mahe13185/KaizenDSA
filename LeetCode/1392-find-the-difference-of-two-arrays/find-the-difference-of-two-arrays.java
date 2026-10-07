class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();

        
        for (int ele : nums2) {
            seen.add(ele);
        }

        // Elements in nums2 but not nums1
        List<Integer> first = new ArrayList<>();

        for (int ele : nums1) {
            if (!seen.contains(ele) && !added.contains(ele)) {
                first.add(ele);
                added.add(ele);
            }
        }

        res.add(first);

        // Clear for second direction
        seen.clear();
        added.clear();

        // nums2 → seen
        for (int ele : nums1) {
            seen.add(ele);
        }

        // Elements in nums1 but not nums2
        List<Integer> second = new ArrayList<>();

        for (int ele : nums2) {
            if (!seen.contains(ele) && !added.contains(ele)) {
                second.add(ele);
                added.add(ele);
            }
        }

        res.add(second);

        return res;
    }
}