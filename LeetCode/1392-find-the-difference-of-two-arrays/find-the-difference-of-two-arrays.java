class Solution {
        public  List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int ele : nums1)
            set1.add(ele);
        for (int ele : nums2)
            set2.add(ele);

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int ele : set1){
            if(!set2.contains(ele))
                first.add(ele);
        }

        for (int ele : set2){
            if (!set1.contains(ele))
                second.add(ele);
        }

        return List.of(first,second);
    }

}