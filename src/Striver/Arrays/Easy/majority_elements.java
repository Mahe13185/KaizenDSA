package Striver.Arrays.Easy;

import java.util.HashMap;

class majority_elements {
    // Returns the majority element.
    public static int majorityElement(int[] nums) {
        int threshold = nums.length / 2;
        HashMap<Integer, Integer> frequencies = new HashMap<>();

        // Record each value and test its updated frequency.
        for (int value : nums) {
            int updatedFrequency = frequencies.getOrDefault(value, 0) + 1;
            frequencies.put(value, updatedFrequency);

            // The first frequency above the threshold identifies the majority.
            if (updatedFrequency > threshold) {
                return value;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 1};

        // instance for class Solution
        System.out.println(majorityElement(nums));

    }
}

// Driver code