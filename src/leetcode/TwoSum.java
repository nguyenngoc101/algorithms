package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15, 13, 17};
        int[] indices = twoSum(ints, 19);
        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> invertedMap = new HashMap<>();
        Map<Integer, Integer> missedMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            invertedMap.put(i, target - nums[i]);
            missedMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer missedNumber = invertedMap.get(i);
            Integer foundNumber = missedMap.get(missedNumber);
            if (foundNumber != null && i != foundNumber) {
                return new int[] { i, foundNumber };
            }
        }
        throw new IllegalArgumentException("Illegal argument exception");
    }

}
