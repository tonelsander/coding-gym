package com.codinggym.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayParsing {

    /*
        Find the index of the two numbers that sum up to the target sum.
        Input: nums = [2, 7, 11, 15], target = 9
        Output: [0, 1] (because nums[0] + nums[1] = 2 + 7 = 9)

        The array is not guaranteed to be sorted.

        Time complexity: O(n), the array is scanned only once and access to hash map is O(1)
        Space complexity: O(n), creation of the hash map with all array elements when no numbers sum up target
     */
    int[] findIndexForTargetSum(int[] array, int target) {
        Map<Integer, Integer> elementsByIndex = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int complement = target - current;
            if (elementsByIndex.containsKey(complement)) {
                return new int[]{ elementsByIndex.get(complement), i };
            }
            elementsByIndex.put(current, i);
        }
        return new int[0];
    }
}
