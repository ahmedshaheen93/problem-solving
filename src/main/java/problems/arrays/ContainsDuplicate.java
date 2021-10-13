package problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: nums = [1,2,3,1]
 * * <br>
 * Output: true
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: nums = [1,2,3,4]
 * * <br>
 * Output: false
 * <br>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            if (map.containsKey(number)) {
                return true;
            } else {
                map.put(number, 1);
            }
        }
        return false;
    }
}
